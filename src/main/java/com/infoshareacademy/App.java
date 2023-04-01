package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();

        List<Car> cars = copyTable(car1, car2, car3);

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static List<Car> copyTable(Car... cars) {
//        return new ArrayList<>(Arrays.asList(cars));

        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            result.add(car);
        }

        return result;
    }
}
