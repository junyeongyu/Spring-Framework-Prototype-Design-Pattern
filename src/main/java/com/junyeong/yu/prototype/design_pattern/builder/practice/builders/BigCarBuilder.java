package com.junyeong.yu.prototype.design_pattern.builder.practice.builders;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerI;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;

public class BigCarBuilder extends CarBuilderA {

    public BigCarBuilder(CarMakerI carMaker) {
        super(carMaker);
    }

    @Override
    public CarBuilderA addBody() {
        car.setBody(CarS.MESSAGE_BIG_BODY);
        return this;
    }

    @Override
    public CarBuilderA addEngine() {
        car.setEngine(CarS.MESSAGE_BIG_ENGINE);
        return this;
    }

    @Override
    public CarBuilderA addDoors() {
        car.setDoors(CarS.MESSAGE_BIG_DOORS);
        return this;
    }

    @Override
    public CarBuilderA addWheels() {
        car.setWheels(CarS.MESSAGE_BIG_WHEELS);
        return this;
    }
}
