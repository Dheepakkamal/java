package com.dheepak.learning.java.random.javaquestions;

public class BooleanPlay {
    public static void main(String[] args) {
        if(true ^ false) {
            System.out.println("hello");
        } else {
            System.out.println("world");
        }

        String val = "1";
        Boolean answer = Boolean.valueOf(val);
        System.out.println(answer);
    }
}
