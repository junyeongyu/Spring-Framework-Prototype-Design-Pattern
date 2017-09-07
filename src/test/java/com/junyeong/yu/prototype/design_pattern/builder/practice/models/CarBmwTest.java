package com.junyeong.yu.prototype.design_pattern.builder.practice.models;

import com.junyeong.yu.prototype.design_pattern.builder.practice.factory.CarFactory;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CarBmwTest {

    private CarA car;

    @Before
    public void setUp() throws Exception {
        car = new CarBmw();
    }

    @Test
    public void getBrand() throws Exception {
        assertThat(car.getBrand(), is(CarS.BMW_BRAND));
    }

}