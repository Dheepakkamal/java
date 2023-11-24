package com.dheepak.learning.java.random.threads;

public class ExecutableInterface implements Runnable{

    synchronized void threadMethod() {
        System.out.println("Hello from synchronized method");
    }
    @Override
    public void run() {
        threadMethod();
        System.out.println("In Runnable interface");
    }
}
