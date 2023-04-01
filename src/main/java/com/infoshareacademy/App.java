package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;

public class App {
    public static void main( String[] args ) {

        Engine engine1 = new Engine(100, 1000);
        Engine engine2 = new Engine(200, 2000);
        Engine engine3 = new Engine(100, 1000);

        List<Engine> engines = new ArrayList<>();
        engines.add(engine1);
        engines.add(engine2);
        engines.add(engine3);

        for (Engine engine : engines) {
            System.out.println(engine);
        }
    }
}
