package com.leroy.practice;

import com.leroy.practice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class PracticeApplication {



    public static void main(String[] args) {
     //   System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(PracticeApplication.class, args);


    }

}
