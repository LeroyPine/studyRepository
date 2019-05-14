package com.leroy.practice.mq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    // 默认创建一个 名字叫做leroy 的队列
    @Bean
    public Queue queue(){
        return new Queue("Leroy");
    }
}
