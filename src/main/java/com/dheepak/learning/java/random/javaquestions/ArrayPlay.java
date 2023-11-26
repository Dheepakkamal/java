package com.dheepak.learning.java.random.javaquestions;

public class ArrayPlay {
    static void update(int[] array) {
        array = new int[20];
    }

    public static void main(String[] args) {
        int[] arra = new int[10];
        System.out.println(arra.length);
        update(arra);
        System.out.println(arra.length);
    }
}
