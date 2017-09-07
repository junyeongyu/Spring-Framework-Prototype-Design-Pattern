package com.junyeong.yu.prototype.design_pattern.builder.practice.stubs;

import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.CarBuilderA;

public class CarBuilderStub extends CarBuilderA {
    @Override
    public CarBuilderA addBody() {
        return null;
    }

    @Override
    public CarBuilderA addEngine() {
        return null;
    }

    @Override
    public CarBuilderA addDoors() {
        return null;
    }

    @Override
    public CarBuilderA addWheels() {
        return null;
    }
}
