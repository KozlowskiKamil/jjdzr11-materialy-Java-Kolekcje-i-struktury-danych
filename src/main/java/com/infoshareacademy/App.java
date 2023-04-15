package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        Car car4 = CarFactory.createRandomCar();
        Car car5 = CarFactory.createRandomCar();

        List<Car> filterCars = filterCars(car1, car2, car3, car4, car5);
        for (Car car : filterCars) {
            System.out.println(car);
        }
    }

    private static List<Car> filterCars(Car... cars) {
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (!car.getName().equals("Fiat")) {
                result.add(car);
            }
        }

        return result;
    }
}
