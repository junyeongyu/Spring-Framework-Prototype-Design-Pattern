package com.junyeong.yu.prototype.design_pattern.builder.practice.factory;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarManufacture;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builder.BigCarBuilder;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builder.CarBuilderA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builder.SmallCarBuilder;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarBmw;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarToyota;

public class CarFactory {
    private CarManufacture carManufacture = new CarManufacture(); // stateless object
    private CarBuilderA smallCarBuilder = new SmallCarBuilder(); // stateless object
    private CarBuilderA bigCarBuilder = new BigCarBuilder(); // stateless object

    public synchronized CarA createSmallCarToyota() {
        // 1.1. Small Toyota Car
        carManufacture.setCarBuilder(smallCarBuilder);
        carManufacture.setCarClass(CarToyota.class);
        return getCar();
    }

    public synchronized CarA createSmallCarBmw() {
        // 1.2. Small Bmw Car
        carManufacture.setCarBuilder(smallCarBuilder);
        carManufacture.setCarClass(CarBmw.class);
        return getCar();
    }

    public synchronized CarA createBigCarToyota() {
        // 2.1. Big Toyota Car
        carManufacture.setCarBuilder(bigCarBuilder);
        carManufacture.setCarClass(CarToyota.class);
        return getCar();
    }

    public synchronized CarA createBigCarBmw() {
        // 2.2 Big Bmw Car
        carManufacture.setCarClass(CarBmw.class);
        carManufacture.setCarBuilder(bigCarBuilder);
        return getCar();
    }

    private CarA getCar() {
        return carManufacture.buildCar().getCar();
    }
}
