package com.dheepak.learning.java.random.buildcar;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBody(new Body("black"));
        car.setEngine(new Engine("Mercedes", "gasoline", 2500, "off"));
        car.startEngine(car.getEngine());
        log.info(car.toString());
    }
}
