package com.junyeong.yu.prototype.design_pattern.builder.practice.factory;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerBmw;
import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerToyota;
import com.junyeong.yu.prototype.design_pattern.builder.practice.CarManufacture;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.BigCarBuilder;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.SmallCarBuilder;

public class CarManufactureFactory {

    public static CarManufacture createSmallCarToyota() {
        // 1.1. Small Toyota CarManufacture
        CarManufacture carManufacture = new CarManufacture();
        carManufacture.setCarBuilder(new SmallCarBuilder(new CarMakerToyota()));
        return carManufacture.buildCar();
    }

    public static CarManufacture createSmallCarBmw() {
        // 1.2. Small Bmw CarManufacture
        CarManufacture carManufacture = new CarManufacture();
        carManufacture.setCarBuilder(new SmallCarBuilder(new CarMakerBmw()));
        return carManufacture.buildCar();
    }

    public static CarManufacture createBigCarToyota() {
        // 2.1. Big Toyota CarManufacture
        CarManufacture carManufacture = new CarManufacture();
        carManufacture.setCarBuilder(new BigCarBuilder(new CarMakerToyota()));
        return carManufacture.buildCar();
    }

    public static CarManufacture createBigCarBmw() {
        // 2.2 Big Bmw CarManufacture
        CarManufacture carManufacture = new CarManufacture();
        carManufacture.setCarBuilder(new BigCarBuilder(new CarMakerBmw()));
        return carManufacture.buildCar();
    }
}