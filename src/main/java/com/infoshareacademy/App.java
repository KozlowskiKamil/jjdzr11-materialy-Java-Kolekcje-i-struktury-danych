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

        Engine engine = EngineFactory.generateEngine();
        System.out.println(engine);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(engine);
        System.out.println(json);

        Engine fromJson = gson.fromJson(json, Engine.class);
        System.out.println(fromJson);
    }
}
