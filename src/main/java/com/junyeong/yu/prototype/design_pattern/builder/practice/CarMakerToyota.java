package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarBmw;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarToyota;

public class CarMakerToyota implements CarMakerI {
    @Override
    public CarA createCar() {
        return new CarToyota();
    }
}