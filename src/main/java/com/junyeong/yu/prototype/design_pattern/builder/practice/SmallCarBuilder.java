package com.junyeong.yu.prototype.design_pattern.builder.practice;

public class SmallCarBuilder extends CarBuilder {
    @Override
    public CarBuilder addBody() {
        car.setBody("Small Body");
        return this;
    }

    @Override
    public CarBuilder addEngine() {
        car.setEngine("Small Engine");
        return this;
    }

    @Override
    public CarBuilder addDoors() {
        car.setDoors("Small Doors");
        return this;
    }

    @Override
    public CarBuilder addWheels() {
        car.setWheels("Small Wheels");
        return this;
    }
}
