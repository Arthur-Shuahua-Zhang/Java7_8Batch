package com.antra.day5;

import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadCreationDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new CustomizedThread();
        t1.start();

        Thread t2 = new Thread(new RunnanleThread());
        t2.start();


        FutureTask ft = new FutureTask(new CallableThread());
        Thread t3 = new Thread(ft);
        t3.start();
        System.out.println(ft.get());

        Thread t4 = new Thread(
                () -> {
                    System.out.println("from runnable, by using lambda expression");
                }
        );
        t4.start();
    }
}


class CustomizedThread extends Thread {
    public void run() {
        System.out.println("extends thread class, the currerent thread is " + Thread.currentThread().getName());
    }
}

class RunnanleThread implements Runnable {

    @Override
    public void run() {
        System.out.println("from runable, the currerent thread is " + Thread.currentThread().getName());
    }
}

class CallableThread implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("from callable, the currerent thread is " + Thread.currentThread().getName());
        return 200;
    }
}