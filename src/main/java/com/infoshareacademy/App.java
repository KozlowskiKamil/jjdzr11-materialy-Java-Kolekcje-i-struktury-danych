package com.infoshareacademy;


import com.infoshareacademy.model.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main( String[] args ) {
        Engine engine1 = new Engine(100, 1000);
        Engine engine2 = new Engine(100, 1000);
        Engine engine3 = new Engine(200, 2000);

        Map<Integer, Engine> engines = groupByPower(engine1, engine2, engine3);
        System.out.println(engines);
    }

    private static Map<Integer, Engine> groupByPower(Engine... engines) {
        Map<Integer, Engine> result = new HashMap<>();

        for (Engine engine : engines) {
            Integer power = engine.getPower();
            result.put(power, engine);
        }
        return result;
    }
}
