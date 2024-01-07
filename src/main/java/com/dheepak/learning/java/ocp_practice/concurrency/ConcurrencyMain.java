package com.dheepak.learning.java.ocp_practice.concurrency;


public class ConcurrencyMain {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Method main() runs in thread " + threadName);
        // Create a Counter object:
        Counter counter = new Counter();
        // Create two threads with the same Counter:
        Thread threadA = new Thread(counter, "Thread A");
        Thread threadB = new Thread(counter, "Thread B");
        // Start the two threads:
        System.out.println("Starting " + threadA.getName());
        threadA.start();
        //  threadA.start();                            // (9) Il
        System.out.println("Starting " + threadB.getName());
        threadB.start();
        System.out.println("Exiting Thread " + threadName);


    }

}
