package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.factory.CarManufactureFactory;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;

import java.util.ArrayList;
import java.util.List;

public class CarBuilderDemo {
    public static void main (String[] args) {

        CarManufactureFactory carManufactureFactory = new CarManufactureFactory();

        List<CarA> carList = new ArrayList<>();
        carList.add(carManufactureFactory.createSmallCarToyota().getCar());
        carList.add(carManufactureFactory.createSmallCarBmw().getCar());
        carList.add(carManufactureFactory.createBigCarToyota().getCar());
        carList.add(carManufactureFactory.createBigCarBmw().getCar());

        carList.forEach((v) -> System.out.println(v));
    }
}