/*
package com.leroy.practice.mq.send;

import com.leroy.practice.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Objects;

@Component
public class LeroySender {


    @Resource
    private AmqpTemplate rabbitTemplate;    //  引入 rabbitmq 的实现类


    public void send(){
        User user = new User("测试呀","男");
        String msg = "开始学习RabbitMQ了";
      */
/*  System.out.println("Sender:"+msg);*//*

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


    public static void main(String[] args) {
*/
/*        String a = "ab,";
        String[] split = a.split(",");
        boolean contains = a.contains(",");
        System.out.println(contains);
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);*//*



        String a = null;
        String b = "!23";

        boolean equals = Objects.equals(a, b);
        System.out.println(equals);

    }
}
*/
