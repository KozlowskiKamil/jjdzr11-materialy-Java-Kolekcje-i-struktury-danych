package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);

        System.out.println(list);
        System.out.println(list.size());
    }
}
