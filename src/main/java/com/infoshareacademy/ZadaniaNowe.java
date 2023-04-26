package com.infoshareacademy;

import com.infoshareacademy.comparators.ComparatorCap;
import com.infoshareacademy.comparators.ComparatorMaxSpeed;
import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Color;
import com.infoshareacademy.model.Engine;

import javax.sound.midi.Patch;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
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

    public static void main(String[] args) throws IOException {
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
        System.out.println("stringCarMap1 = " + stringCarMap1);


        System.out.println("==============Zadanie 12 ==================");
        List<Car> carsList = CarFactory.createRandomCars(4);
//        Map<Integer, List<Car>> integerListMap = Zad12(carsList);
//        System.out.println("integerListMap = " + integerListMap);

        //metoda na stream  do zliczania ile jest danego obiektu np
        List<Car> carList = CarFactory.createRandomCars(5);


        System.out.println("==============Zadanie 13 ==================");
        Iterator<Car> iterator = carsList.iterator();
        Car lastCar = null;
        while (iterator.hasNext()) {
            lastCar = iterator.next();
        }
        if (lastCar != null) {
            iterator.remove(); // usuwamy ostatni samochód
        }

        System.out.println("==============Zadanie 12 druga metoda ==================");
//        carsList.stream().collect(Collectors.groupingBy(Car::getEngine));

        Map<String, List<Car>> collect = carList.stream().collect(Collectors.groupingBy(Car::getName));
        carList.forEach(System.out::println);
        collect.forEach((k, v) -> System.out.println("k = " + k + " : " + v.size()));

        System.out.println("==============Zadanie Comparable  ==================");
        List<Integer> integers = new ArrayList<>(List.of(4, 3, 1, 2, 5));
        Collections.sort(integers);
        System.out.println("integers = " + integers);

        List<Engine> engineList = EngineFactory.generateEngines(5);
        engineList.forEach(System.out::println);
        System.out.println(engine1.compareTo(engine2));
        Collections.sort(engineList);
        engineList.forEach(System.out::println);


        System.out.println("==============Zadanie 14  ==================");
        carList.forEach(System.out::println);
        System.out.println("---------");
        Collections.sort(carList);
        carList.forEach(System.out::println);

        System.out.println("==============Zadanie Comparator  zad 15A ==================");
        carList.stream().sorted().forEach(System.out::println);
        System.out.println("");
        carList.stream().sorted((c1, c2) -> c1.getColor().compareTo(c2.getColor())).forEach(System.out::println);
        System.out.println("");
        Collections.sort(carList);
        carList.forEach(System.out::println);
        System.out.println("");
        Collections.sort(carList, (c1, c2) -> c2.getEngine().getPower().compareTo(c1.getEngine().getPower()));
        carList.forEach(System.out::println);



        System.out.println("==============Zadanie Comparator 15b ==================");
        carList.forEach(System.out::println);
        System.out.println("-----Capacity--------");
        Collections.sort(carList, new ComparatorCap());
        carList.forEach(System.out::println);
        System.out.println("------Max speed-------");
        Collections.sort(carList, new ComparatorMaxSpeed());
        carList.forEach(System.out::println);


        System.out.println("==============Zadanie Comparator 13a ==================");
        Collections.sort(carList, (c1, c2) -> c1.getName().length() - c2.getName().length());
        carList.forEach(System.out::println);

        System.out.println("==============Zadanie propertise i path==================");
        Path pathToFile = Path.of("src", "main", "resources", "config.properties");
        Properties systemProps = System.getProperties();
        System.out.println("systemProps = " + systemProps);

        Properties confProp = new Properties();
        confProp.load(new FileInputStream(pathToFile.toString()));
        confProp.put("Show key", "No add and save");
        confProp.setProperty("Kamil", "Add and Save");
        System.out.println("confProp = " + confProp);
        System.out.println("confProp.get(\"version\") = " + confProp.get("version"));
        System.out.println("confProp.get(\"version\") = " + confProp.get("key"));



    }

    public static Map<Integer, List<Car>> Zad12(List<Car> cars) {
        Map<Integer, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            Integer key = car.getEngine().getCapacity();
            result.putIfAbsent(key, new ArrayList<>());
            List<Car> tempValue = result.get(key);
            tempValue.add(car);
            result.put(key, tempValue);
        }
        return result;

    }

    public static Map<String, Car> addCar(Car... cars) {
        Map<String, Car> result = new HashMap<>();
        for (Car car : cars) {
            result.put(car.getName(), car);
        }
        return result;
    }
}
