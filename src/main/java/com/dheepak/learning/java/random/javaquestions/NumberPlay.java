package com.dheepak.learning.java.random.javaquestions;

public class NumberPlay {

    public static int get(int num) {
        return 1-num;
    }

    static void print(int x, int y){
        System.out.println("a");

    }

    static void print(int ...x){
        System.out.println("x");

    }
    public static void main(String[] args) {


        int numint = 10;
        long numlong = 0B1010;
        System.out.println(numint==numlong);

        System.out.println(get(0));
        System.out.println(get(1));

        print(1, 2);
        print(1);
        double num = 10.7;
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));

        int i =0;
//        i = i++ + 10;
//        i = i+ + +10;
        i = i - - 10;
        System.out.println(i);

        int character = 'A';
        character++;
        System.out.println(character);

        double d = -10;
        d = d/0.0;
        System.out.println(d);

        int o = 010;
//        o store octal number 10 that is prefixed with 0...but jvm provide value in decimal form that's why answer is 8.
        System.out.println(o);

        Integer x = 127;
        Integer y = 127;
        Integer z = 128;
        Integer w = 128;
        System.out.println(x==y);
        System.out.println(w==z);

        byte b = -128;
        b--;
        b--;
        System.out.println(b);

    }
}
