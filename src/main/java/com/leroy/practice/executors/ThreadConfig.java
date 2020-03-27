package com.leroy.practice.executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * Created by philalina on 2019-11-14.
 * com.ziroom.evaluate.config.
 * ziroom-evaluate-service.
 */

@Configuration
public class ThreadConfig {

    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        executor.setCorePoolSize(1);
        // 设置最大线程数
        executor.setMaxPoolSize(1);
        // 设置队列容量
        executor.setQueueCapacity(5);
        // 设置线程活跃时间（秒）
        executor.setKeepAliveSeconds(120);
        // 设置默认线程名称
        executor.setThreadNamePrefix("evaluate-async-");



        // 设置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}