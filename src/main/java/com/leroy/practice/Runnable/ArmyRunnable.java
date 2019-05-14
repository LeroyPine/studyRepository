package com.leroy.practice.Runnable;

/**
 * 军队
 */
public class ArmyRunnable implements Runnable{

    //保证了线程可以正确读取其他线程写入的值
    //可见性  Ref JMM  happens - before 原则
    volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
                //让出了处理器时间   下次进攻不一定
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
