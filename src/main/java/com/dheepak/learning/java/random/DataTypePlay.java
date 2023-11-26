package com.dheepak.learning.java.random;

public class DataTypePlay {

    public static void main(String[] args) {

        Long lon = 100l;
        String s = new String("string");

        if (lon.equals(s)) {
            System.out.println("Equals");
        }

        String s1 = new String("string 1");
        String s2 = "string 2";

        int a = 8;
        int b = a<<2;
        int c = a>>2;
        System.out.println(b + " - " + c);

        int x = 0;
        int y = ++x + x;
        System.out.println(x + " - " + y);
    }

}
