package com.dheepak.learning.java.ocp_practice.concurrency;

import java.util.Arrays;

public class Counter implements Runnable {
    private int counter = 0;
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " " + Thread.currentThread().getState());
        while (counter<5) {
            try {
                Thread.sleep(1000);
                System.out.printf("%s: old:%s new:%s%n", threadName, this.counter, ++this.counter);
                System.out.println(threadName + " " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                System.out.println(threadName + " interuppted.");
            }
        }

        System.out.println("Exiting " + threadName);
    }
}
