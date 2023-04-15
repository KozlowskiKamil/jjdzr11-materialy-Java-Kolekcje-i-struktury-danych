package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        Car car4 = CarFactory.createRandomCar();
        car3.setName("Fiat");
        car4.setName("Fiat");

        Map<String, Car> cars = groupByName(car1, car2, car3, car4);
        for (String s : cars.keySet()) {
            System.out.println(s + " : " + cars.get(s));
        }
    }

    private static Map<String, Car> groupByName(Car... cars) {
        Map<String, Car> result = new HashMap<>();

        for (Car car : cars) {
            String name = car.getName();
            result.put(name, car);
        }
        return result;
    }
}
