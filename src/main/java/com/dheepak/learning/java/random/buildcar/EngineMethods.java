package com.dheepak.learning.java.random.buildcar;

abstract class EngineMethods {
    void startEngine(Engine engine) {
        engine.setIgnition("on");
    }

    void stopEngine(Engine engine){
        engine.setIgnition("off");
    }

}
