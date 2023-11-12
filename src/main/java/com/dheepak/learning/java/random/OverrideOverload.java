package com.dheepak.learning.java.random;

class ClassA {
    static {
        System.out.println("Static at class A");
    }
    ClassA() {
        System.out.println("Constructor ClassA");
    }

    void whereAmI() {
        System.out.println("I am in class A");
    }
}
class ClassB extends ClassA {
    ClassB() {
        System.out.println("Constructor ClassB");
    }
    static {
        System.out.println("Static at class B");
    }

    void whereAmI() {
        System.out.println("I am in class B");
    }
}
public class OverrideOverload {
    static {
        System.out.println("Static at class main");
    }

    public static void main(String[] args) {

        ClassA classARef = new ClassB();
        classARef.whereAmI();
    }
}
