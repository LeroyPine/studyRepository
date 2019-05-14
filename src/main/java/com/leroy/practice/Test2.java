package com.leroy.practice;

import java.util.concurrent.CyclicBarrier;

public class Test2 {

    static class ResourceClass {

        public final static ThreadLocal<String> RESOURCE_1 =
                new ThreadLocal<String>();

        public final static ThreadLocal<String> RESOURCE_2 =
                new ThreadLocal<String>();

    }

    public static void main(String []args) {
        int threadNum = 5;    //模拟多个窗口 进行售票
        final CyclicBarrier barrier = new CyclicBarrier(threadNum);
    }
}
