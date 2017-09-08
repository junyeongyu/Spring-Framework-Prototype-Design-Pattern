package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.CarBuilderA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;

public class CarManufacture {
    private CarBuilderA carBuilder;

    public void setCarBuilder(CarBuilderA carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarA getCar() {
        return carBuilder.getCar();
    }

    public CarManufacture buildCar() {
        carBuilder = carBuilder.createCar()
                .addBody()
                .addEngine()
                .addDoors()
                .addWheels();
        return this;
    }
}