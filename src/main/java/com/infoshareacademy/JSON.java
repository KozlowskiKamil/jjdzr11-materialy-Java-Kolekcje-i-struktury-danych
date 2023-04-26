package com.infoshareacademy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class JSON {
    public static void main(String[] args) throws IOException {
        System.out.println("--------- Zadanie 17a JSON ------------");
        Engine engine = EngineFactory.generateEngine();
        System.out.println("engine = " + engine);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(engine);
        System.out.println("json = " + json);

        Engine fromJson = objectMapper.readValue(json, Engine.class);
        System.out.println("fromJson = " + fromJson);

        System.out.println("--------- Zadanie 17b JSON ------------");
        Engine engine1 = EngineFactory.generateEngine();
        Engine engine2 = EngineFactory.generateEngine();
        Engine engine3 = EngineFactory.generateEngine();
        Engine[] array = {engine1, engine2, engine3};

        ObjectMapper objectMapper1 = new ObjectMapper();
        String arraytoJson = objectMapper1
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(array);
        System.out.println("arraytoJson = " + arraytoJson);

        Engine[] engines = objectMapper1.readValue(arraytoJson, Engine[].class);
        for (Engine eng : engines) {
            System.out.println("eng = " + eng);
        }

        System.out.println("--------- Zadanie 17c JSON ------------");
        List<Engine> engineList = new ArrayList<>(List.of(engine1, engine2, engine3));

        ObjectMapper objectMapper2 = new ObjectMapper();
        String valueAsString = objectMapper2
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(engineList);
        System.out.println("valueAsString = " + valueAsString);

        TypeReference<List<Engine>> typeReference = new TypeReference<>() {
        };
        List<Engine> engineList1 = objectMapper2.readValue(valueAsString, typeReference);
        System.out.println("engineList1 = " + engineList1.equals(engineList));


        System.out.println("--------- Zadanie 18a GSON ------------");

        Gson gson = new Gson();
        String toGson = gson.toJson(engine1);
        System.out.println("toGson = " + toGson);

        Engine fromGson = gson.fromJson(toGson, Engine.class);
        System.out.println("fromGson = " + fromGson);


        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson1 = gsonBuilder.create();

        String toGson1 = gson1.toJson(engine1);
        System.out.println("toGson 1 = " + toGson1);

        Engine fromGson1 = gson1.fromJson(toGson, Engine.class);
        System.out.println("fromGson 1 = " + fromGson1);

        System.out.println("--------- Zadanie 18b GSON ------------");
        Engine[] array2 = {engine1, engine2, engine3};

        GsonBuilder gsonBuilder1 = new GsonBuilder();
        gsonBuilder1.setPrettyPrinting();
        Gson gson2 = gsonBuilder1.create();

        String toJson = gson2.toJson(array2);
        System.out.println("toJson = " + toJson);

        Engine[] fromJson1 = gson2.fromJson(toJson, Engine[].class);
        for (Engine eng : fromJson1) {
            System.out.println("eng = " + eng);
        }

        System.out.println("--------- Zadanie 18c GSON ------------");

        String toJsonList = gson2.toJson(engineList1);
        System.out.println("toJsonList = " + toJsonList);

        Type type = new TypeToken<List<Engine>>(){}.getType();
        List<Engine> fromGSON = gson2.fromJson(toJsonList, type);
        fromGSON.forEach(System.out::println);

        Path path = Path.of("src", "main", "resources", "engines.json");
        Files.writeString(path, toJsonList);

    }
}
