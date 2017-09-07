package com.junyeong.yu.prototype.design_pattern.builder.practice.models;

import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CarToyotaTest {

    private CarA car;

    @Before
    public void setUp() throws Exception {
        car = new CarToyota();
    }

    @Test
    public void getBrand() throws Exception {
        assertThat(car.getBrand(), is(CarS.TOYOTA_BRAND));
    }

}