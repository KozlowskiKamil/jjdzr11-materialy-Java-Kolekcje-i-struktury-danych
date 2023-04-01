package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        Engine engine1 = EngineFactory.generateEngine();
        Engine engine2 = EngineFactory.generateEngine();
        Engine engine3 = new Engine(100, 1000);
        Engine engine4 = new Engine(100, 1000);

        Set<Engine> engines = copyTable(engine1, engine2, engine3, engine4);
        System.out.println(engines.size());
        for (Engine engine : engines) {
            System.out.println(engine);
        }
    }

    private static Set<Engine> copyTable(Engine... engines) {
        //return new HashSet<>(Arrays.asList(engines));

        Set<Engine> result = new HashSet<>();

        for (Engine engine : engines) {
            result.add(engine);
        }
        return result;
    }
}
