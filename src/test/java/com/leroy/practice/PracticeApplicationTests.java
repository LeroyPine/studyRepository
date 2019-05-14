package com.leroy.practice;

import com.leroy.practice.executors.RedisLock;
import com.leroy.practice.executors.TicketRunnable;
import com.leroy.practice.mq.send.CallBackSender;
import com.leroy.practice.mq.send.LeroySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {




    @Resource
    private LeroySender leroySender;
    @Resource
    private CallBackSender callBackSender;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {

        //leroySender.send();   //测试发送

        leroySender.send1();

        //leroySender.send2();
    }


    @Test
    public void oneToMany() {
        for (int i = 0; i < 100; i++) {
            leroySender.send();
        }
    }


    @Test
    public void topicConfirm() {
        callBackSender.send("topic.#", "测试mq的确认提交");
    }



    @Resource
    private RedisLock redisLock;

    @Test
    public void contextLoads1() {
        try {
        ArrayList<Thread> list = new ArrayList<>();
        for(int i =0; i<20; i++) {
            //logger.info("线程开始");
            Thread t = new Thread() {
                @Override
                public void run() {
                    redisLock.sellTicket();
                }
            };
            list.add(t);
            t.start();
        }
        for(Thread t : list) {
            t.join();
        }
        Thread.sleep(10000);
    }
    catch (Exception e){

    }}
}
