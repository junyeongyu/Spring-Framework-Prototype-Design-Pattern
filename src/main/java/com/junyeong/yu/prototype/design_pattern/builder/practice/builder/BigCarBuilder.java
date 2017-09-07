package com.junyeong.yu.prototype.design_pattern.builder.practice.builder;

public class BigCarBuilder extends CarBuilderA {
    @Override
    public CarBuilderA addBody() {
        car.setBody("Big Body");
        return this;
    }

    @Override
    public CarBuilderA addEngine() {
        car.setEngine("Big Engine");
        return this;
    }

    @Override
    public CarBuilderA addDoors() {
        car.setDoors("Big Doors");
        return this;
    }

    @Override
    public CarBuilderA addWheels() {
        car.setWheels("Big Wheels");
        return this;
    }
}
