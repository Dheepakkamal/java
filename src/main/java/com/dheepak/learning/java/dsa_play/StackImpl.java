package com.dheepak.learning.java.dsa_play;

public class StackImpl {

    static class Stack {

        int max = 5;
        int top;
        int[] stackArr = new int[max];

        Stack() {
            top = -1;
        }

        boolean push (int data) {
            if(top+1 < max) {
                stackArr[++top] = data;
                return true;
            }
            else {
                System.out.println("Stack overflow");
                return false;
            }
        }

        int pop () {
            if(top < 0) {
                System.out.println("Stack underflow");
                return top;
            } else {
                return stackArr[--top];
            }
        }

        void print() {
            for(int i = top-1; i>-1; i--) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();

    }
}
