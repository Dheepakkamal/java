package com.dheepak.learning.java.random.javaquestions.inheritance;

public class Parent {
    void print() {
        System.out.println("In Parent class");
    }

    private void privatePrint() {
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.privatePrint();
    }
}
