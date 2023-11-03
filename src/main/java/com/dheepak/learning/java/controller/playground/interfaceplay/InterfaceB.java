package com.dheepak.learning.java.controller.playground.interfaceplay;

public interface InterfaceB {
//    void play();
    default void play() {
        System.out.println("Play from InterfaceB default method");
    }
}
