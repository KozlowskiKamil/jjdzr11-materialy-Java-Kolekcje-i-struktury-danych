package com.infoshareacademy;


import com.infoshareacademy.comparators.PowerComparator;
import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main( String[] args ) {

        List<Car> cars = CarFactory.createRandomCars(3);
        cars.forEach(System.out::println);

        Collections.sort(cars);
        System.out.println("sorted by color");
        cars.forEach(System.out::println);

        System.out.println("sorted by engine power");
        Collections.sort(cars, new PowerComparator());
        cars.forEach(System.out::println);
    }
}
