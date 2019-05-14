package com.leroy.practice.mq.config;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TopicRabbitConfig {


    @Value("${spring.rabbitmq.host}")
    private String address;

    @Value("${spring.rabbitmq.port}")
    private String port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualHost;

    @Value("${spring.rabbitmq.publisher-confirms}")
    private boolean publisherConfirms;


    //设置两个队列

    final static String message = "topic.message";
    final static String messages = "topic.messages";


    //创建连接工厂


    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory  connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(address + ":" + port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualHost);
        // 进行消息回调
        connectionFactory.setPublisherConfirms(publisherConfirms);
        return connectionFactory;
    }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //设置为多例    因为设置回调类
    public RabbitTemplate rabbitTemplate(){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMandatory(true);
        return rabbitTemplate;
    }



    @Bean
    public Queue queueMessage(){
        return new Queue(TopicRabbitConfig.message);   //设置队列  message
    }

    @Bean
    public Queue queueMessages(){
        return new Queue(TopicRabbitConfig.messages);   //设置队列  message
    }


    //设置交换器
    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindExchangeMessage(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindExchangeMessages(Queue queueMessages,TopicExchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }

    @Bean
    public SimpleMessageListenerContainer messageListenerContainer(){
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
        container.setQueues(queueMessages());
        container.setExposeListenerChannel(true);
        container.setMaxConcurrentConsumers(1);
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        container.setMessageListener(new ChannelAwareMessageListener() {
            @Override
            public void onMessage(Message message, Channel channel) throws Exception {
               try {
                   System.out.println("消费端接受消息："
                           +message.getMessageProperties() + ":" + new String(message.getBody()));

                   System.out.println("topic" + message.getMessageProperties().getReceivedRoutingKey());

                   channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);

               }catch (Exception e){
                   e.printStackTrace();

                   if (message.getMessageProperties().getRedelivered()) {
                       System.out.println("消息已重复处理失败,拒绝再次接收...");
                       channel.basicReject(message.getMessageProperties().getDeliveryTag(), true); // 拒绝消息
                   } else {
                       System.out.println("消息即将再次返回队列处理...");
                       channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true); // requeue为是否重新回到队列
                   }

               }
            }
        });
        return container;
    }
}
