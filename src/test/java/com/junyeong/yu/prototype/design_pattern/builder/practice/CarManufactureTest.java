package com.junyeong.yu.prototype.design_pattern.builder.practice;

import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.CarBuilderA;
import com.junyeong.yu.prototype.design_pattern.builder.practice.builders.SmallCarBuilder;
import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarA;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;


import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class CarManufactureTest {

    @Rule public ExpectedException expectedException = ExpectedException.none();
    private CarManufacture carManufacture;
    private CarBuilderA carBuilder;

    @Before
    public void setUp() throws Exception {
        carManufacture = new CarManufacture();
        carBuilder = new SmallCarBuilder(new CarMakerToyota());
        //carManufacture.setCarBuilder(carBuilder);
    }

    @Test
    public void setCarBuilder() throws Exception {
        CarManufacture carManufactureMock = Mockito.mock(CarManufacture.class);
        carManufactureMock.setCarBuilder(carBuilder);
        verify(carManufactureMock).setCarBuilder(carBuilder);
    }

    @Test
    public void getCar_is_exception() throws Exception {
        //doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());
        carManufacture.setCarBuilder(carBuilder);
        carBuilder.setCarMaker(null);
        expectedException.expect(NullPointerException.class);
        carManufacture.buildCar().getCar();
    }
    @Test
    public void getCar_is_notnull() throws Exception {
        carManufacture.setCarBuilder(carBuilder);
        CarA car = carManufacture.buildCar().getCar();
        assertThat(car, notNullValue());
    }

    @Test
    public void buildCar() throws Exception {
        carManufacture.setCarBuilder(carBuilder);
        CarManufacture carManufactureTemp = carManufacture.buildCar();
        assertThat(carManufactureTemp, notNullValue());
    }
}