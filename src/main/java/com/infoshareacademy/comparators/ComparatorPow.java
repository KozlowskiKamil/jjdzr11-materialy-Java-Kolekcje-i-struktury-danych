package com.infoshareacademy.comparators;

import com.infoshareacademy.model.Car;

import java.util.Comparator;

public class ComparatorPow implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.getEngine().getPower().compareTo(o1.getEngine().getPower());
    }
}
