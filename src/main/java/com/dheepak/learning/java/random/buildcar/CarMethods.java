package com.dheepak.learning.java.random.buildcar;

abstract class CarMethods implements BodyMethods, EngineMethods{
    @Override
    public void openDoor(Body body) {
        body.setDoorStatus("open");
    }

    @Override
    public void closeDoor(Body body) {
        body.setDoorStatus("close");
    }

    @Override
    public void openBoot(Body body) {
        body.setBootStatus("open");
    }

    @Override
    public void closeBoot(Body body) {
        body.setBootStatus("close");
    }

    @Override
    public void startEngine(Engine engine) {
        engine.setIgnition("on");
    }

    @Override
    public void stopEngine(Engine engine) {
        engine.setIgnition("off");
    }
}
