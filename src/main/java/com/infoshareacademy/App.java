package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;

public class App {
    public static void main( String[] args ) {

        Set<String> strings = new HashSet<>();
        strings.add("info");
        strings.add("Share");
        strings.add("Academy");

        System.out.println(strings.contains("info"));
        System.out.println(strings.contains("INFO"));
    }
}
