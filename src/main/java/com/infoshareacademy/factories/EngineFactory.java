package com.infoshareacademy.factories;

import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EngineFactory {
    private static final Random random = new Random();

    public static Engine generateEngine() {
        Engine engine = new Engine();
        engine.setPower(generateNumber(50, 200, 10));
        engine.setCapacity(generateNumber(1000, 5000, 1000));
        return engine;
    }

    public static List<Engine> generateEngines(int amount) {
        List<Engine> result = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            result.add(generateEngine());
        }
        return result;
    }

    private static Integer generateNumber(int min, int max, int step) {
        return random.ints(min / step, max / step)
                .findFirst()
                .getAsInt() * step;
    }
}
