package com.dheepak.learning.java.random.javaquestions.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.print();
        Child child = new Child();
        child.print();
        Parent parentChild = new Child();
        parentChild.print();
    }
}
