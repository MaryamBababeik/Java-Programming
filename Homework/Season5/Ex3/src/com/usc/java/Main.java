package com.usc.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = CarFactory.getCar(Car.Benz);
        car.speed();
        car.start();
        car.stop();
    }
}
