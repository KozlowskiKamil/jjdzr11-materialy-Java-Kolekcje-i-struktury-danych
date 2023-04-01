package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;

public class App {
    public static void main( String[] args ) {

        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        Car car4 = CarFactory.createRandomCar();
        Car car5 = CarFactory.createRandomCar();

        Car[] filterCars = filterCars(car1, car2, car3, car4, car5);
        for (Car car : filterCars) {
            System.out.println(car);
        }
    }

    private static Car[] filterCars(Car... cars) {
        Car[] result = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].getName().equals("Fiat")) {
                result[i] = cars[i];
            }
        }

        return result;
    }
}
