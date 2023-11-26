package com.dheepak.learning.java.random.javaquestions;

public class RunnablePlay {
    public static void main(String[] args) {
        final int x = 100;
        Runnable play = new Runnable() {
            public void run() {
                System.out.println(x);
            }
        };
        System.out.println(x);
        play.run();
    }
}
