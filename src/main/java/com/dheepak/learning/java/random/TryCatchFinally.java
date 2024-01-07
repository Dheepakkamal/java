package com.dheepak.learning.java.random;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            int a =  2 / 0;
        } catch (ArithmeticException e) {
            System.out.println(1);
        }
        finally {
            System.out.println(0);
        }

        try {
//            System.exit(0);
            System.out.println("In try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("In catch");
            return;
        } finally {
            System.out.println("In finally");
            return;
        }

//        System.out.println(trycatch());
//        try {
//            return;
//        } finally {
//            System.out.println("in finally");
//        }

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
