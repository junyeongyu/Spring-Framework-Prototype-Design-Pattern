package com.junyeong.yu.prototype.design_pattern.builder.practice.models;

import com.junyeong.yu.prototype.design_pattern.builder.practice.CarManufacture;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CarATest {

    private CarA car;
    private final String TEST_BRAND = "TestBrand";
    private final String TEST_BODY = "TestBody";
    private final String TEST_ENGINE = "TestEngine";
    private final String TEST_DOORS = "TestDoors";
    private final String TEST_WHEELS = "TestWheels";

    @Before
    public void setUp() throws Exception {
        car = new CarA() {
            @Override
            public String getBrand() {
                return TEST_BRAND;
            }
        };
    }

    @Test
    public void getBrand() throws Exception {
        assertThat(car.getBrand(), is(TEST_BRAND));
    }

    @Test
    public void getBody() throws Exception {
        car.setBody(TEST_BODY);
        assertThat(car.getBody(), is(TEST_BODY));
    }

    @Test
    public void setBody() throws Exception {
        CarA carMock = Mockito.mock(CarA.class);
        carMock.setBody(TEST_BODY);
        verify(carMock, times(1)).setBody(TEST_BODY);
    }

    @Test
    public void getEngine() throws Exception {
        car.setEngine(TEST_ENGINE);
        assertThat(car.getEngine(), is(TEST_ENGINE));
    }

    @Test
    public void setEngine() throws Exception {
        CarA carMock = Mockito.mock(CarA.class);
        carMock.setEngine(TEST_ENGINE);
        verify(carMock, times(1)).setEngine(TEST_ENGINE);
    }

    @Test
    public void getDoors() throws Exception {
        car.setDoors(TEST_DOORS);
        assertThat(car.getDoors(), is(TEST_DOORS));
    }

    @Test
    public void setDoors() throws Exception {
        CarA carMock = Mockito.mock(CarA.class);
        carMock.setDoors(TEST_DOORS);
        verify(carMock, times(1)).setDoors(TEST_DOORS);
    }

    @Test
    public void getWheels() throws Exception {
        car.setWheels(TEST_WHEELS);
        assertThat(car.getWheels(), is(TEST_WHEELS));
    }

    @Test
    public void setWheels() throws Exception {
        CarA carMock = Mockito.mock(CarA.class);
        carMock.setWheels(TEST_WHEELS);
        verify(carMock, times(1)).setWheels(TEST_WHEELS);
    }

}