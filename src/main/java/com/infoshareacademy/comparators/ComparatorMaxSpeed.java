package com.infoshareacademy.comparators;

import com.infoshareacademy.model.Car;

import java.util.Calendar;
import java.util.Comparator;

public class ComparatorMaxSpeed implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getMaxSpeed() - o1.getMaxSpeed();
    }
}
