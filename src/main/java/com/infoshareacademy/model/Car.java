package com.infoshareacademy.model;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private int maxSpeed;
    private Engine engine;
    private Color color;

    public Car() {
        name = "default name";
        maxSpeed = 150;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(name, car.name) && Objects.equals(engine, car.engine) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed, engine, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engine=" + engine +
                ", color=" + color +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int compareTo(Car o) {
        return this.getColor().compareTo(o.getColor());
    }
}