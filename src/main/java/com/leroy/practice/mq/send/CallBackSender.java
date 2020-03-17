/*
package com.leroy.practice.mq.send;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.amqp.support.Correlation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class CallBackSender implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String s) {
        System.out.println("消息id:" + correlationData.getId());
        if (ack){
            System.out.println("消息发送确认成功");
        }else {
            System.out.println("消息发送确认失败" + s);
        }

    }


    //输出 返回的信息
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        System.out.println("return--message:" + new String(message.getBody()) + ",replyCode:" + replyCode
                + ",replyText:" + replyText + ",exchange:" + exchange + ",routingKey:" + routingKey);

    }

    public void send(String topic, String message){
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setReturnCallback(this);
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());   // id  volatile
        System.out.println("消息id" + correlationData.getId());
        this.rabbitTemplate.convertAndSend("exchange",topic,message,correlationData);
    }
}
*/
