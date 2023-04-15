package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.*;

public class App {
    public static void main( String[] args ) {
//        List<Car> cars = CarFactory.createRandomCars(5);
//        cars.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> iterator = numbers.iterator();

        System.out.println(numbers);
        while (iterator.hasNext()) {
            Integer nextValue = iterator.next();
            if (nextValue % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
