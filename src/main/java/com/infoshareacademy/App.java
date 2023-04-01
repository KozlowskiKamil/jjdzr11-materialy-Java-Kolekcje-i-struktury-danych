package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;

public class App {
    public static void main( String[] args ) {

        List<String> strings = new ArrayList<>();
        strings.add("info");
        strings.add("Share");
        strings.add("Academy");

        System.out.println(strings.contains("info"));
        System.out.println(strings.contains("INFO"));
        System.out.println(strings.indexOf("Academy"));
        System.out.println(strings.indexOf("ISA"));
    }
}
