package com.infoshareacademy.factories;

import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Color;
import com.infoshareacademy.model.Engine;

import java.util.Random;

public class CarFactory {
    static final Random random = new Random();

    public static Car createRandomCar() {
        Car car = new Car();
        car.setName(generateName());
        car.setMaxSpeed(generateNumber(100, 250, 10));
        car.setEngine(generateEngine());
        car.setColor(generateColor());
        return car;
    }

    private static String generateName() {
        String[] names = {"Audi", "Opel", "Mercedes", "Fiat", "Ford", "BMW"};
        return names[random.nextInt(names.length)];  //nextInt losuje od 0 do podanego zakresu (wyłączając ostatnią liczbę)
    }

    private static Integer generateNumber(int min, int max, int step) {
        return random.ints(min / step, max / step)
                .findFirst()
                .getAsInt() * step;
    }

    private static Engine generateEngine() {
        return EngineFactory.generateEngine();
    }

    private static Color generateColor() {
        Integer index = generateNumber(0, Color.values().length, 1);
        return Color.values()[index];
    }
}
