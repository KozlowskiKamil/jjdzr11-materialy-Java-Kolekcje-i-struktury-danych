package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        List<Car> cars = CarFactory.createRandomCars(5);
        cars.forEach(System.out::println);

        Map<Integer, List<Car>> groupedCars = groupCars(cars);

        System.out.println(groupedCars);
    }

    private static Map<Integer, List<Car>> groupCars(List<Car> cars) {
        Map<Integer, List<Car>> groupedCars = new HashMap<>();

        for (Car car : cars) {
            Integer key = car.getEngine().getCapacity();

            //dodaję do mapy pustą listę, jeżeli pod danym kluczem nic jeszcze nie ma
            groupedCars.putIfAbsent(key, new ArrayList<>());

            //tempValue - lista wartości obecnie znajdujących się pod danym kluczem
            List<Car> tempValue = groupedCars.get(key);

            //dodaję element do powyższej listy
            tempValue.add(car);

            //nadpisuję mapę, pod dany klucz wrzucam nową listę (poprzednia + 1 element)
            groupedCars.put(key, tempValue);
        }

        return groupedCars;
    }
}
