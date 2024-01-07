package com.dheepak.learning.java.random;

public class HidingOverriding {
    public static void main(String[] args) {double x = 0.0__1;
        A.staticMethod();
        B.staticMethod();
    }
}

class A {
    static void staticMethod() {
        System.out.println("Class A static class");
    }

    public void normalMethod() {
        System.out.println("Class A normal method");
    }
}

class B extends A{
    static void staticMethod() {
        System.out.println("Class B static class");
    }

    public void normalMethod() {
        System.out.println("Class B normal method");
    }
}