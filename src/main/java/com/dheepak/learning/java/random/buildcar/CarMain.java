package com.dheepak.learning.java.random.buildcar;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBody(new Body("Black", 2, "open", "close"));
        car.setEngine(new Engine("Mercedes", "gasoline", 2500, "off"));
        System.out.println(car);
        car.closeDoor(car.getBody());
        System.out.println(car);
        car.startEngine(car.getEngine());
        System.out.println(car);

    }
}
