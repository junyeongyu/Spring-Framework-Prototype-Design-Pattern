package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarBmw;

public class CarMakerBmw implements CarMakerI {
    @Override
    public CarA createCar() {
        return new CarBmw();
    }
}