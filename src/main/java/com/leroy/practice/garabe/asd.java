/*
package com.leroy.practice;

import com.leroy.practice.executors.TicketRunnable;
import org.springframework.util.StopWatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class asd {
    public static void main(String[] args) {
        int threadNum = 5;    //模拟多个窗口 进行售票
        final CyclicBarrier barrier = new CyclicBarrier(threadNum);
        final CountDownLatch count = new CountDownLatch(threadNum);  // 用于统计 执行时长
        StopWatch watch = new StopWatch();
        watch.start();
        TicketRunnable tickets = new TicketRunnable(count,barrier);*/
/**//*
*/
/**//*

        ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
        for (int i = 0; i <threadNum ; i++) {
            executorService.submit(tickets);
        }
        try {
            count.await();
            executorService.shutdown();
            watch.stop();
            System.out.println("耗 时:" + watch.getTotalTimeSeconds() + "秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/
