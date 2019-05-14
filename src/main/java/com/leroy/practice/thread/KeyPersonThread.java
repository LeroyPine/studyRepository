package com.leroy.practice.thread;

public class KeyPersonThread extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始了战斗");

        for (int i = 0; i < 10; i++) {
            System.out.println(getName() +"就是干。。。。。");
        }

        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
