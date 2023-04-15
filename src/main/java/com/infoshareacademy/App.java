package com.infoshareacademy;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main( String[] args ) {

        Integer k1 = 1;
        Integer k2 = 2;
        Integer k3 = 3;
        Integer k4 = 2;

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v2";
        String v4 = "v4";

        Map<Integer, String> map = new HashMap<>();
        map.putIfAbsent(k1, v1);
        map.putIfAbsent(k2, v2);
        map.putIfAbsent(k3, v3);
        map.putIfAbsent(k4, v4);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry);
        }
    }
}
