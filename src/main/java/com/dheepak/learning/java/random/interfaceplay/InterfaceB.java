package com.dheepak.learning.java.random.interfaceplay;

public interface InterfaceB {
//    void play();
    default void play() {
        System.out.println("Play from InterfaceB default method");
    }
}
