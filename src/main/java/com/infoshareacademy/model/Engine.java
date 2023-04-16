package com.infoshareacademy.model;

import java.util.Objects;

public class Engine implements Comparable<Engine> {
    private Integer power;
    private Integer capacity;

    public Engine() {
    }

    public Engine(Integer power, Integer capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(power, engine.power) && Objects.equals(capacity, engine.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, capacity);
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Engine o) {
//        return this.power.compareTo(o.getPower());
        if (this.power > o.getPower()) {
            return 1;
        } else if (this.power < o.getPower()) {
            return -1;
        } else {
            return 0;
        }
    }
}
