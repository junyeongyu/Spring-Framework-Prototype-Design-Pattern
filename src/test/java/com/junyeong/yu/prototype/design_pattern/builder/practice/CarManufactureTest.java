package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.CarBuilderA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.SmallCarBuilder;
import com.junyeong.yu.prototype.design_pattern.builder.practice.factory.CarFactory;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarToyota;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class CarManufactureTest {

    private CarManufacture carManufacture;
    private CarBuilderA carBuilder;

    @Before
    public void setUp() throws Exception {
        carManufacture = new CarManufacture();
        carBuilder = new SmallCarBuilder();
        //carManufacture.setCarBuilder(carBuilder);
    }

    @Test
    public void setCarClass() throws Exception {
        CarManufacture carManufactureMock = Mockito.mock(CarManufacture.class);
        carManufactureMock.setCarClass(CarToyota.class);
        verify(carManufactureMock, times(1)).setCarClass(CarToyota.class);
    }

    @Test
    public void setCarBuilder() throws Exception {
        CarManufacture carManufactureMock = Mockito.mock(CarManufacture.class);
        carManufactureMock.setCarBuilder(carBuilder);
        verify(carManufactureMock, times(1)).setCarBuilder(carBuilder);
    }

    @Test
    public void getCar_is_exception() throws Exception {
        //doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());
        carManufacture.setCarBuilder(carBuilder);
        CarA car = null;
        try {
            car = carManufacture.buildCar().getCar();
        } catch (NullPointerException e){
        }
        assertThat(car, nullValue());
    }
    @Test
    public void getCar_is_notnull() throws Exception {
        carManufacture.setCarBuilder(carBuilder);
        carManufacture.setCarClass(CarToyota.class);
        CarA car = carManufacture.buildCar().getCar();
        assertThat(car, notNullValue());
    }

    @Test
    public void buildCar() throws Exception {
        carManufacture.setCarBuilder(carBuilder);
        carManufacture.setCarClass(CarToyota.class);
        CarManufacture carManufactureTemp = carManufacture.buildCar();
        assertThat(carManufactureTemp, notNullValue());
    }

}