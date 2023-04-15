package com.infoshareacademy;


import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        List<Engine> engines = EngineFactory.generateEngines(4);
        engines.forEach(System.out::println);

//        {2000={engine4}, 3000={engine2}, 4000={engine1, engine3}}

        Map<Integer, List<Engine>> groupedEngines = new HashMap<>();

        for (Engine engine : engines) {
            Integer key = engine.getCapacity();

            //dodaję do mapy pustą listę, jeżeli pod danym kluczem nic jeszcze nie ma
            groupedEngines.putIfAbsent(key, new ArrayList<>());

            //tempValue - lista wartości obecnie znajdujących się pod danym kluczem
            List<Engine> tempValue = groupedEngines.get(key);

            //dodaję element do powyższej listy
            tempValue.add(engine);

            //key = pojemność silnika
            //value = lista silników o danej pojemności
            //nadpisuję mapę, pod dany klucz wrzucam nową listę (poprzednia + 1 element)
            groupedEngines.put(key, tempValue);
        }

        System.out.println(groupedEngines);
    }
}
