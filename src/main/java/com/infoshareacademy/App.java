package com.infoshareacademy;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main( String[] args ) throws IOException {

        Engine engine1 = EngineFactory.generateEngine();
        Engine engine2 = EngineFactory.generateEngine();
        Engine[] engines = {engine1, engine2};

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(engines);
        System.out.println(json);

        Engine[] fromJson = gson.fromJson(json, Engine[].class);
        for (Engine engine : fromJson) {
            System.out.println(engine);
        }
    }
}
