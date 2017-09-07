package com.junyeong.yu.prototype.design_pattern.builder.practice.builder;

public class SmallCarBuilder extends CarBuilderA {
    @Override
    public CarBuilderA addBody() {
        car.setBody("Small Body");
        return this;
    }

    @Override
    public CarBuilderA addEngine() {
        car.setEngine("Small Engine");
        return this;
    }

    @Override
    public CarBuilderA addDoors() {
        car.setDoors("Small Doors");
        return this;
    }

    @Override
    public CarBuilderA addWheels() {
        car.setWheels("Small Wheels");
        return this;
    }
}
