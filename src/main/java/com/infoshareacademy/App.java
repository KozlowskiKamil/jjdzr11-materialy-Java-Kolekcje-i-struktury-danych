package com.infoshareacademy;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        Engine engine = EngineFactory.generateEngine();
        System.out.println(engine);

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(engine);
        System.out.println(json);

        Engine fromJson = objectMapper.readValue(json, Engine.class);
        System.out.println(fromJson);
        System.out.println(engine.equals(fromJson));
    }
}
