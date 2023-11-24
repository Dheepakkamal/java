package com.dheepak.learning.java.playground;

public class BeanLifeCycle {

    public static void main(String[] args) {
        System.out.println("hello form main");

    }
    public void init() {
        System.out.println("hello form init");
    }
    public void destroy() {
        System.out.println("hello form destroy");
    }
}
