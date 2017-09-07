package com.junyeong.yu.prototype.design_pattern.builder.practice;

abstract public class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public CarBuilder createCar() {
        this.car = new Car();
        return this;
    }

    public abstract CarBuilder addBody();
    public abstract CarBuilder addEngine();
    public abstract CarBuilder addDoors();
    public abstract CarBuilder addWheels();
}
