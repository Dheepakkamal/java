package com.dheepak.learning.java.random;

class ClassA {
    static {
        System.out.println("Static at class A");
    }
    ClassA() {
        System.out.println("Constructor ClassA");
    }
}
class ClassB extends ClassA {
    ClassB() {
        System.out.println("Constructor ClassB");
    }
    static {
        System.out.println("Static at class B");
    }
}
public class OverrideOverload {
    static {
        System.out.println("Static at class main");
    }

    public static void main(String[] args) {
        ClassB classARef = new ClassB();
    }
}
