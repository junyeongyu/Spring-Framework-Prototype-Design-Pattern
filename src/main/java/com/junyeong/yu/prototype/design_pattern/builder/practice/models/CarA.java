package com.junyeong.yu.prototype.design_pattern.builder.practice.models;

abstract public class CarA {
    private String brand;
    private String body;
    private String engine;
    private String doors;
    private String wheels;

    public CarA() {
        this.brand = getBrand();
    }

    abstract public String getBrand();

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "CarA{" +
                "brand='" + brand + '\'' +
                ", body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", doors='" + doors + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
