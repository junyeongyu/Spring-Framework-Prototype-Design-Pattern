package com.junyeong.yu.prototype.design_pattern.builder.practice.builders;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarMakerToyota;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarToyota;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import com.junyeong.yu.prototype.design_pattern.builder.practice.stubs.CarBuilderStub;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

public class CarBuilderATest {

    private CarBuilderA carBuilder;

    @Before
    public void setUp() throws Exception {
        carBuilder = new CarBuilderStub(new CarMakerToyota());
    }

    @Test
    public void setCarBrand() throws Exception {
        carBuilder.setCarMaker(new CarMakerToyota());
        assertThat(carBuilder.createCar().getCar().getBrand(), is(CarS.TOYOTA_BRAND));
    }

    @Test
    public void getCar() throws Exception {
        assertThat(carBuilder.createCar().getCar(), notNullValue());
    }

    @Test
    public void createCar() throws Exception {
        assertThat(carBuilder.createCar(), notNullValue());
    }

}