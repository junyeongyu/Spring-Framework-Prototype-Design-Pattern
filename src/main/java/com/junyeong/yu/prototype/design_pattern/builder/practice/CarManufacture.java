package com.junyeong.yu.prototype.design_pattern.builder.practice;

public class CarManufacture {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build() {
        return carBuilder.getCar();
    }

    public CarManufacture constructCar() {
        carBuilder = carBuilder.createCar()
                .addBody()
                .addEngine()
                .addDoors()
                .addWheels();
        return this;
    }
}
