package com.infoshareacademy;


import com.infoshareacademy.comparators.CapacityComparator;
import com.infoshareacademy.comparators.PowerComparator;
import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main( String[] args ) throws IOException {
        Path pathToConfig = Path.of("src", "main", "resources", "config.properties");

        System.out.println(pathToConfig.toString());

        Properties properties = new Properties();
        properties.load(new FileInputStream(pathToConfig.toString()));

        System.out.println(properties);
        System.out.println(properties.get("version"));
        System.out.println(properties.get("key"));
    }
}
