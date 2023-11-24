package com.dheepak.learning.java.random.threads;

public class ThreadMain {

    public static void main(String[] args) {
        RunInterface thread = new RunInterface();
        thread.start();
        ExecutableInterface exec = new ExecutableInterface();
        Thread t1 = new Thread(exec);
        t1.start();
    }
}
