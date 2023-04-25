package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZadaniaNowe {

    public static Map<String, Car> CarsCopy(Car... cars) {
        Map<String, Car> result = new HashMap<>();
        for (Car car : cars) {
            String key = car.getName();
            result.put(key, car);
        }
        return result;
    }


    public static List<Car> CarsIn(Car... cars) {
        List<Car> cars1 = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            cars1.add(cars[i]);
        }
        return cars1;
    }

    public static Set<Engine> EngineCopy(Engine... engines) {
        System.out.println("==============Zadanie 5 po świetach ==================");

        Set<Engine> engines1 = new HashSet<>();
        for (Engine eng : engines) {
            engines1.add(eng);
        }
        return engines1;
    }

    public static void main(String[] args) {
        List<Car> randomCars = CarFactory.createRandomCars(3);
        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        List<Car> cars = CarsIn(car1, car2, car3);
        for (Car car :
                cars) {
            System.out.println("cars = " + cars);
        }
        System.out.println("==============Zadanie 9 po świetach==================");
        Engine engine1 = EngineFactory.generateEngine();
        Engine engine2 = EngineFactory.generateEngine();
        Engine engine3 = new Engine(100, 1000);
        Engine engine4 = new Engine(100, 1000);

        Set<Engine> engines11 = EngineCopy(engine1, engine2, engine3, engine4);
        System.out.println("engines11 = " + engines11.size());

        engines11.forEach(s -> System.out.println("s = " + s));

        System.out.println("==============Zadanie 10B po świetach ==================");
        Integer integer = 1;
        Integer integer2 = 2;
        Integer integer3 = 3;
        Integer integer5 = 5;

        String string1 = "ISA";
        String string2 = "info";
        String string3 = "Share";
        String string4 = "Java";
        Map<Integer, String> map = new HashMap<>();
        map.put(integer, string1);
        map.put(integer2, string2);
        map.put(integer3, string3);
        map.put(integer5, string4);

        System.out.println("map = " + map.get(4));
        System.out.println("map = " + map.get(5));
        System.out.println("map.containsKey(15) = " + map.containsKey(15));
        System.out.println("map = " + map.containsValue("ISA"));


        System.out.println("==============Zadanie 11b ==================");
        Map<String, Car> stringCarMap = CarsCopy(car1, car2, car3);
        System.out.println("stringCarMap = " + stringCarMap);

        Map<String, Car> stringCarMap1 = addCar(car1, car2, car3);
        System.out. println("stringCarMap1 = " + stringCarMap1);


        System.out.println("==============Zadanie 12 ==================");
        List<Car> carsList = CarFactory.createRandomCars(4);
        Map<Integer, List<Car>> integerListMap = Zad12(carsList);
        System.out.println("integerListMap = " + integerListMap);

        //metoda na stream  do zliczania ile jest danego obiektu np
        List<Car> carList = CarFactory.createRandomCars(5);

        carsList.stream().collect(Collectors.groupingBy(Car::getEngine));

        Map<String, List<Car>> collect = carList.stream().collect(Collectors.groupingBy(Car::getName));
        carList.forEach(System.out::println);
        collect.forEach((k, v) -> System.out.println("k = " + k + " : " + v.size()));


        System.out.println("==============Zadanie 13 ==================");
        Iterator<Car> iterator = carsList.iterator();
        Car lastCar = null;
        while (iterator.hasNext()) {
            lastCar = iterator.next();
        }
        if (lastCar != null) {
            iterator.remove(); // usuwamy ostatni samochód
        }

        System.out.println("==============Zadanie 12 ==================");


    }

    public static Map<Integer, List<Car>> Zad12(List<Car> cars){
        Map<Integer, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            Integer key = car.getEngine().getCapacity();
            result.putIfAbsent(key, new ArrayList<>());
            List<Car> tempValue = result.get(key);
            tempValue.add(car);
            result.put(key, tempValue);
        }return result;

    }

    public static Map<String, Car> addCar(Car... cars) {
        Map<String, Car> result = new HashMap<>();
        for (Car car : cars) {
            result.put(car.getName(), car);
        }
        return result;
    }
}
