package com.leroy.practice.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年03月07日 16:48
 * @since 1.0
 */
public class LeroyExecutor  {


    private static final Executor exec = Executors.newFixedThreadPool(100);

    private static final ExecutorService exectorSer = Executors.newFixedThreadPool(100);;

    public static void execOne() {
        Runnable task = () -> {
            long i;
            for (i = 0; i < 1000L; i++) {

            }
            System.out.println(i);

        };
        exec.execute(task);
    }


    public static void execTwo(){
        exectorSer.isShutdown();
    }


    public static void main(String[] args) {
        System.out.println(123);
        execOne();
        System.out.println(1234);



        Executors.newSingleThreadExecutor();
    }

}
