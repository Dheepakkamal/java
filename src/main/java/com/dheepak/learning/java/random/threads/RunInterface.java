package com.dheepak.learning.java.random.threads;

public class RunInterface extends Thread{

    public void run() {
        System.out.println("In Run Interface");
        ExecutableInterface exec = new ExecutableInterface();
        Thread t1 = new Thread(exec);
        t1.start();
    }
}
