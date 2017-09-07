package com.junyeong.yu.prototype.design_pattern.builder.practice.factory;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CarFactoryTest {
    private CarFactory carFactory;

    @Before
    public void setUp() throws Exception {
        carFactory = new CarFactory();
    }

    @Test
    public void createSmallCarToyota_is_small() throws Exception {
        CarA car = carFactory.createSmallCarToyota();
        assertThat(car.getBody(), is(CarS.MESSAGE_SMALL_BODY));
    }
    @Test
    public void createSmallCarToyota_is_toyota() throws Exception {
        CarA car = carFactory.createSmallCarToyota();
        assertThat(car.getBrand(), is(CarS.TOYOTA_BRAND));
    }

    @Test
    public void createSmallCarBmw_is_small() throws Exception {
        CarA car = carFactory.createSmallCarBmw();
        assertThat(car.getBody(), is(CarS.MESSAGE_SMALL_BODY));
    }
    @Test
    public void createSmallCarBmw_is_bmw() throws Exception {
        CarA car = carFactory.createSmallCarBmw();
        assertThat(car.getBrand(), is(CarS.BMW_BRAND));
    }

    @Test
    public void createBigCarToyota_is_big() throws Exception {
        CarA car = carFactory.createBigCarToyota();
        assertThat(car.getBody(), is(CarS.MESSAGE_BIG_BODY));
    }
    @Test
    public void createBigCarToyota_is_toyota() throws Exception {
        CarA car = carFactory.createBigCarToyota();
        assertThat(car.getBrand(), is(CarS.TOYOTA_BRAND));
    }

    @Test
    public void createBigCarBmw_is_big() throws Exception {
        CarA car = carFactory.createBigCarBmw();
        assertThat(car.getBody(), is(CarS.MESSAGE_BIG_BODY));
    }
    @Test
    public void createBigCarBmw_is_bmw() throws Exception {
        CarA car = carFactory.createBigCarBmw();
        assertThat(car.getBrand(), is(CarS.BMW_BRAND));
    }
}