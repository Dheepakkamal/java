package com.dheepak.learning.java.ocp_practice.concurrency;

public class ThreadRunnable implements Runnable{

    void waitMethod() throws InterruptedException {
//        while (Thread.interrupted()) {
//            System.out.println("-------");
//            System.out.println(Thread.currentThread());
//            wait(10000);
//        }
        System.out.println("Before sleep");
        Thread.sleep(1000000);
        System.out.println("After sleep");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread runnable is running");
        try {
            waitMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
