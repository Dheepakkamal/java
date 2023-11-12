package com.dheepak.learning.java.random;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            System.exit(0);
            System.out.println("In try");
        } catch (Exception e) {
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }
    }

}
