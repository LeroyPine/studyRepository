package com.leroy.practice.mq.send;

import com.leroy.practice.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LeroySender {


    @Resource
    private AmqpTemplate rabbitTemplate;    //  引入 rabbitmq 的实现类


    public void send(){
        User user = new User("测试呀","男");
        String msg = "开始学习RabbitMQ了";
      /*  System.out.println("Sender:"+msg);*/
        this.rabbitTemplate.convertAndSend("Leroy",user);
        // covertAndSend    和  send  的区别呢    ==  另一个不必须是message 类型
    }

    public void send1(){
        String msg = "测试 topic1";
        rabbitTemplate.convertAndSend("exchange","topic.message",msg);    // 路由key
    }

    public void send2(){
        String msg = "测试 topic2";
        rabbitTemplate.convertAndSend("exchange","topic.#",msg);    // 路由key
    }
}
