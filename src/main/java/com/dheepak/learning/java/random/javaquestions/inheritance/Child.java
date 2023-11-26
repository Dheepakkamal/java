package com.dheepak.learning.java.random.javaquestions.inheritance;

public class Child extends Parent{
    void print() {
//        super.print();
        System.out.println("In child class");
    }

    public void privatePrint() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Child parent = new Child();
        parent.privatePrint();
    }

}
