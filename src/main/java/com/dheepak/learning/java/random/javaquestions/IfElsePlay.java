package com.dheepak.learning.java.random.javaquestions;

public class IfElsePlay {
    static int x = 0;

    static {
        System.out.println("Static executed");
    }
    static boolean increment() {
        x++;
        return true;
    }
    public static void main(String[] args) {
       if((increment()|increment()) || increment()) {
           x++;
       }
        System.out.println(x);
    }
}
