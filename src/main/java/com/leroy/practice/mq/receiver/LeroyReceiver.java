package com.leroy.practice.mq.receiver;

import com.leroy.practice.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LeroyReceiver {    //消费者


   /* @RabbitHandler
    @RabbitListener(queues = "Leroy")
    public  void  process(User msg){
        System.out.println("Receiver:"+msg);
    }


    @RabbitHandler
    @RabbitListener(queues = "topic.message")
    public  void  process1(String msg){
        System.out.println("Receiver1:"+msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.messages")
    public  void  process2(String msg){
        System.out.println("Receiver2:"+msg);
    }*/
}
