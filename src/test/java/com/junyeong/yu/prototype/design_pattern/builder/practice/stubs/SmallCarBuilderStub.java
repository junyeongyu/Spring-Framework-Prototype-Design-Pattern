package com.junyeong.yu.prototype.design_pattern.builder.practice.stubs;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerI;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.SmallCarBuilder;

public class SmallCarBuilderStub extends SmallCarBuilder {

    public SmallCarBuilderStub(CarMakerI carMaker) {
        super(carMaker);
    }

    public String getBody() {
        return car.getBody();
    }

    public String getEngine() {
        return car.getEngine();
    }

    public String getDoors() {
        return car.getDoors();
    }

    public String getWheels() {
        return car.getWheels();
    }
}
