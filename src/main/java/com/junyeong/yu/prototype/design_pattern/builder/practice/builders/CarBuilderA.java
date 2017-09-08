package com.junyeong.yu.prototype.design_pattern.builder.practice.builders;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerI;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;

abstract public class CarBuilderA {
    protected CarA car;

    private CarMakerI carMaker;

    public CarBuilderA (CarMakerI carMaker) {
        this.setCarMaker(carMaker);
    }

    public void setCarMaker(CarMakerI carMaker) {
        this.carMaker = carMaker;
    }

    public CarA getCar() {
        if (car == null) {
            throw new RuntimeException(CarS.MESSAGE_CAR_NULL_ERROR);
        }
        return car;
    }

    public CarBuilderA createCar() {
        car = carMaker.createCar();
        return this;
    }

    public abstract CarBuilderA addBody();
    public abstract CarBuilderA addEngine();
    public abstract CarBuilderA addDoors();
    public abstract CarBuilderA addWheels();
}