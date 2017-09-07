package com.junyeong.yu.prototype.design_pattern.builder.practice;

public class BigCarBuilder extends CarBuilder{
    @Override
    public CarBuilder addBody() {
        car.setBody("Big Body");
        return this;
    }

    @Override
    public CarBuilder addEngine() {
        car.setEngine("Big Engine");
        return this;
    }

    @Override
    public CarBuilder addDoors() {
        car.setDoors("Big Doors");
        return this;
    }

    @Override
    public CarBuilder addWheels() {
        car.setWheels("Big Wheels");
        return this;
    }
}
