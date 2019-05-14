package com.leroy.practice.Runnable;

import com.leroy.practice.thread.KeyPersonThread;

/**
 * 舞台
 */
public class Stage extends Thread{

    public void run(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();            //军队
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();        //平民

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"随军");
        Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");

        //启动线程
        armyOfSuiDynasty.start();
        armyOfRevolt.start();


        //舞台线程休眠
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     /*   armyTaskOfSuiDynasty.keepRunning = false;
        armyTaskOfRevolt.keepRunning = false;

        try {
            armyOfSuiDynasty.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

     Thread mrCheng = new KeyPersonThread();
     mrCheng.setName("程咬金");
     System.out.println("程咬金的理想就是结束战争,使得百姓安居乐业！");

     //停止线程
     armyTaskOfSuiDynasty.keepRunning = false;
     armyTaskOfRevolt.keepRunning = false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 关键人物出场
         */
        mrCheng.start();
        try {
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Stage().start();
    }
}
