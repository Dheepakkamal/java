package com.dheepak.learning.java.random;

public class TryCatchFinally {

    public static void main(String[] args) {

//        try {
//            System.exit(0);
//            System.out.println("In try");
//        } catch (Exception e) {
//            System.out.println("In catch");
//        } finally {
//            System.out.println("In finally");
//        }

        System.out.println(trycatch());
        try {
            return;
        } finally {
            System.out.println("in finally");
        }

    }

    private static int trycatch() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }


}
