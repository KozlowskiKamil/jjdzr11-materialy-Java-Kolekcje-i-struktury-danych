package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main( String[] args ) {

        List<Engine> engines = EngineFactory.generateEngines(4);
        engines.forEach(System.out::println);

        Map<Integer, List<Engine>> groupedEngines = new HashMap<>();
        for (Engine engine : engines) {
            Integer key = engine.getCapacity();
            groupedEngines.putIfAbsent(key, new ArrayList<>());
            groupedEngines.get(key).add(engine);
        }

        Map<Integer, List<Engine>> groupedByStream = engines.stream()
                .collect(Collectors.groupingBy(Engine::getCapacity));

        groupedEngines.forEach((k,v) -> System.out.println(k + " : " + v.size()));
        System.out.println("----");
        groupedByStream.forEach((k,v) -> System.out.println(k + " : " + v.size()));
    }
}
