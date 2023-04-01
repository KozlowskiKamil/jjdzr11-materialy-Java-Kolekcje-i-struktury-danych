package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

public class App {
    public static void main( String[] args ) {

        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();

        Car[] duplicatedValues = copyTable(car1, car2);

        for (Car duplicatedValue : duplicatedValues) {
            System.out.println(duplicatedValue);
        }
    }

    private static Car[] copyTable(Car... params) {
        Car[] result = new Car[params.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = params[i];
        }

        return result;
    }
}
