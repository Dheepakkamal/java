package com.dheepak.learning.java.ocp_practice.concurrency;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread( new ThreadRunnable ());
        Thread thread2 = new Thread( new ThreadRunnable ());
        Thread thread3 = new Thread( new ThreadRunnable ());

        thread1.setName("t1");
        thread1.start();
        thread2.setName("t2");
        thread2.start();
        thread3.setName("t3");
        thread3.start();


    }
}
