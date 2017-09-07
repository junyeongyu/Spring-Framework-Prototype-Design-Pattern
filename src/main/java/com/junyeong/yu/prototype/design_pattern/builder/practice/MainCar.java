package com.junyeong.yu.prototype.design_pattern.builder.practice;

public class MainCar {
    public static void main (String[] args) {
        CarManufacture carManufacture = new CarManufacture();

        carManufacture.setCarBuilder(new SmallCarBuilder());
        Car smallCar = carManufacture.constructCar().build();
        System.out.println(smallCar.getBody());

        carManufacture.setCarBuilder(new BigCarBuilder());
        Car bigCar = carManufacture.constructCar().build();
        System.out.println(bigCar.getBody());
    }
}