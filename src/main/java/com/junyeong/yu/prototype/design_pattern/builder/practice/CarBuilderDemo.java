package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.factory.CarFactory;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;

import java.util.ArrayList;
import java.util.List;

public class CarBuilderDemo {
    public static void main (String[] args) {

        CarFactory carFactory = new CarFactory();

        List<CarA> carList = new ArrayList<>();
        carList.add(carFactory.createSmallCarToyota());
        carList.add(carFactory.createSmallCarBmw());
        carList.add(carFactory.createBigCarToyota());
        carList.add(carFactory.createBigCarBmw());

        carList.forEach((v) -> System.out.println(v));
    }
}