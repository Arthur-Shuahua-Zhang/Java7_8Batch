package com.antra.day5;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        ExecutorService tp1 = Executors.newFixedThreadPool(3);  // core = 3, max = 3;
        ExecutorService tp2 = Executors.newSingleThreadExecutor(); // // core = 1, max = 1;
        ExecutorService tp3 = Executors.newCachedThreadPool(); // core = 0, max = Integer.MAX_VALUE;
        ExecutorService tp4 = Executors.newScheduledThreadPool(3);  // core = 3, max = Integer.MAX_VALUE;











//        ThreadPoolExecutor threadpool = new ThreadPoolExecutor(
//                2,
//                5,
//                2L,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//        );
//
//        for (int i=1; i<=10; i++) {
//            threadpool.execute(
//                    () -> {
//                        System.out.println(Thread.currentThread().getName() + "is working");
//                    }
//            );
//        }
//
//        threadpool.shutdown();



    }
}
