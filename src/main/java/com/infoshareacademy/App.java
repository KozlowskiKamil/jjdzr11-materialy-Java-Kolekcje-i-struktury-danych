package com.infoshareacademy;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main( String[] args ) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ISA");
        map.put(2, "info");
        map.put(3, "Share");
        map.put(5, "Java");
//        map.put(4, null);

        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.containsKey(15));
        System.out.println(map.containsValue("ISA"));

    }
}
