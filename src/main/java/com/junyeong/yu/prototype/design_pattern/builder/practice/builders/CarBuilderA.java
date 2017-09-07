package com.junyeong.yu.prototype.design_pattern.builder.practice.builders;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;

abstract public class CarBuilderA {
    protected CarA car;
    private Class<? extends CarA> carClass;

    public void setCarBrand(Class<? extends CarA> carClass) {
        this.carClass = carClass;
    }
    public CarA getCar() {
        if (car == null) {
            throw new RuntimeException(CarS.MESSAGE_CAR_NULL_ERROR);
        }
        return car;
    }

    public CarBuilderA createCar() {
        try {
            this.car = carClass.newInstance(); // make instance using child class.
            return this;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract CarBuilderA addBody();
    public abstract CarBuilderA addEngine();
    public abstract CarBuilderA addDoors();
    public abstract CarBuilderA addWheels();
}
