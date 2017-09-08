package com.junyeong.yu.prototype.design_pattern.builder.practice.factory;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CarManufactureFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createSmallCarToyota_is_small() throws Exception {
        CarA car = CarManufactureFactory.createSmallCarToyota().getCar();
        assertThat(car.getBody(), is(CarS.MESSAGE_SMALL_BODY));
    }
    @Test
    public void createSmallCarToyota_is_toyota() throws Exception {
        CarA car = CarManufactureFactory.createSmallCarToyota().getCar();
        assertThat(car.getBrand(), is(CarS.TOYOTA_BRAND));
    }

    @Test
    public void createSmallCarBmw_is_small() throws Exception {
        CarA car = CarManufactureFactory.createSmallCarBmw().getCar();
        assertThat(car.getBody(), is(CarS.MESSAGE_SMALL_BODY));
    }
    @Test
    public void createSmallCarBmw_is_bmw() throws Exception {
        CarA car = CarManufactureFactory.createSmallCarBmw().getCar();
        assertThat(car.getBrand(), is(CarS.BMW_BRAND));
    }

    @Test
    public void createBigCarToyota_is_big() throws Exception {
        CarA car = CarManufactureFactory.createBigCarToyota().getCar();
        assertThat(car.getBody(), is(CarS.MESSAGE_BIG_BODY));
    }
    @Test
    public void createBigCarToyota_is_toyota() throws Exception {
        CarA car = CarManufactureFactory.createBigCarToyota().getCar();
        assertThat(car.getBrand(), is(CarS.TOYOTA_BRAND));
    }

    @Test
    public void createBigCarBmw_is_big() throws Exception {
        CarA car = CarManufactureFactory.createBigCarBmw().getCar();
        assertThat(car.getBody(), is(CarS.MESSAGE_BIG_BODY));
    }
    @Test
    public void createBigCarBmw_is_bmw() throws Exception {
        CarA car = CarManufactureFactory.createBigCarBmw().getCar();
        assertThat(car.getBrand(), is(CarS.BMW_BRAND));
    }
}