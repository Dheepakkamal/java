package com.dheepak.learning.java.playground;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(100);
        integerStack.peek();
        System.out.println(integerStack.pop());
    }

}
