package com.infoshareacademy.factories;

import com.infoshareacademy.model.Engine;

import java.util.Random;

public class EngineFactory {
    private static final Random random = new Random();

    public static Engine generateEngine() {
        Engine engine = new Engine();
        engine.setPower(generateNumber(50, 200, 10));
        engine.setCapacity(generateNumber(1000, 5000, 1000));
        return engine;
    }

    private static Integer generateNumber(int min, int max, int step) {
        return random.ints(min / step, max / step)
                .findFirst()
                .getAsInt() * step;
    }
}
