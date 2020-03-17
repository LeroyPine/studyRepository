/*
package com.leroy.practice.executors;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
*/
/**//*

public class TicketRunnable implements Runnable {
    @Override
    public void run() {

    }

   */
/* @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate redisTemplate;
    private CountDownLatch count;    // 统计数
    private CyclicBarrier barrier;   //栅栏
    private static final Integer Lock_TimeOut = 10000;
    private static final String  LOCK_KEY = "lockKey";
    private volatile boolean working = true;

   public static final ThreadLocal requestIdLocal = new ThreadLocal();   //创建一个ThreadLocal对象 存放

    //获取锁
    private final static DefaultRedisScript<Long> ADD_LOCK_LUA_SCRIPT = new DefaultRedisScript<>(
            "if redis.call(\"setnx\", KEYS[1], KEYS[2]) == 1 then return redis.call(\"pexpire\", KEYS[1], KEYS[3]) else return 0 end"
            , Long.class);

    //定义释放锁的lua脚本
    private final static DefaultRedisScript<Long> UNLOCK_LUA_SCRIPT = new DefaultRedisScript<>(
            "if redis.call(\"get\",KEYS[1]) == KEYS[2] then return redis.call(\"del\",KEYS[1]) else return -1 end"
            , Long.class);


    public TicketRunnable(CountDownLatch count,CyclicBarrier barrier){
        this.count = count;
        this.barrier = barrier;
    }


    private int num = 20 ;   //总票数


    //售票  要获取到锁的时候才可以卖票
    public void sellTicket(){
        try{
            tryLock(LOCK_KEY,this.getRequestId(),2000l,10000l);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                realseLock(LOCK_KEY);
                Thread.sleep(600);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        boolean getLock = tryLock(LOCK_KEY,this.getRequestId(),2000l,1000l);
        if (getLock){
            if (num > 0){
                System.out.println("===="+Thread.currentThread().getName()+ " ====售出票号"+ num);
                num --;
                if (num != 0){
                    System.out.println("==============还剩"+num+"张票");
                }else {
                    System.out.println("票已经售完");
                    working = false;
                }
            }
        }
    }





    private boolean tryLock(String lockKey,String requestId,Long expireTime, Long timeOut) {
        try {
            Long currentTimeMillis = System.currentTimeMillis();   //获取系统当前时间 作为加锁时间
            // 不用系统时间  用设备请求id   目前使用系统时间 做例子
            boolean result = false;
            while (true && working){
                if ((System.currentTimeMillis() - currentTimeMillis) / 1000 > timeOut ){   //获取锁的时间
                    System.out.println("获取锁超时");
                    break;
                }else {
                    //获取锁的具体实现
                    result = innerTryLock(lockKey,requestId,expireTime);
                    if (result){
                        System.out.println("====="+Thread.currentThread().getName() + "==== 获取到锁,开始工作");
                    }else {
                        System.out.println("====="+Thread.currentThread().getName() + "重试获取锁 等待 200 ms 毫秒");
                        Thread.sleep(200);
                    }
                }
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    *//*
*/
/**
     *
     * @param lockKey           锁的key
     * @param requestId         请求唯一标识
     * @param expireTime        锁过期时间
     * @return
     *//*
*/
/*
    private boolean innerTryLock(String lockKey,String requestId,Long expireTime) {
        boolean flag = false;
        try {

            List<String> keys = Arrays.asList(lockKey, requestId, String.valueOf(expireTime));
            Long result = (Long) redisTemplate.execute(ADD_LOCK_LUA_SCRIPT, keys);
            if (result == 1){
                requestIdLocal.set(requestId);
                System.out.println("已设置请求key的值"+ Thread.currentThread().getName() + ","+requestId+" ,Status code reply:" + result);
                //设置成功  获取到锁
               flag = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }


    *//*
*/
/**
     * 释放锁
     * @param lockKey
     *//*
*/
/*
    public void realseLock(String lockKey) {
        try {
            String localRequsetId = stringRedisTemplate.opsForValue().get(lockKey);
            List<String> keys = Arrays.asList(lockKey, localRequsetId);
            Long result = (Long) redisTemplate.execute(UNLOCK_LUA_SCRIPT, keys);
            System.out.println(result);
            //result
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            this.clean();
        }
    }

    private void clean() {
        requestIdLocal.remove();
    }

    private String getRequestId() {
        return UUID.randomUUID().toString();
    }
*//*

*/
/*
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"到达,等待中...");
        try {
            barrier.await();    // 此处阻塞  等所有线程都到位后一起进行抢票

            while (num > 0) {
                sellTicket();
            }
            count.countDown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }*//*

}
*/
