package com.dheepak.learning.java.random.javaquestions;

public class AccessModifier {

    private int i = 100;
    final int max = m1();

    private int m1() {
        System.out.println(max);
        return 100;
    }

    public static void main(String[] args) {
        int i = 1000;
        System.out.println(i);
        AccessModifier modifier = new AccessModifier();
        modifier.printI();
        System.out.println(modifier.max);

    }

    private void printI() {
//    private static void printI(){
        System.out.println("--"+i);
    }
}
