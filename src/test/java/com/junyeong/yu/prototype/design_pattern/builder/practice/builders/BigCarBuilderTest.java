package com.junyeong.yu.prototype.design_pattern.builder.practice.builders;

import com.junyeong.yu.prototype.design_pattern.builder.practice.models.CarToyota;
import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;
import com.junyeong.yu.prototype.design_pattern.builder.practice.stubs.BigCarBuilderStub;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

public class BigCarBuilderTest {

    private BigCarBuilderStub carBuilder;

    @Before
    public void setUp() throws Exception {
        carBuilder = new BigCarBuilderStub();
        carBuilder.setCarClass(CarToyota.class);
        carBuilder.createCar();
    }

    @Test
    public void addBody() throws Exception {
        carBuilder.addBody();
        assertThat(carBuilder.getBody(), is(CarS.MESSAGE_BIG_BODY));
    }

    @Test
    public void addEngine() throws Exception {
        carBuilder.addEngine();
        assertThat(carBuilder.getEngine(), is(CarS.MESSAGE_BIG_ENGINE));
    }

    @Test
    public void addDoors() throws Exception {
        carBuilder.addDoors();
        assertThat(carBuilder.getDoors(), is(CarS.MESSAGE_BIG_DOORS));
    }

    @Test
    public void addWheels() throws Exception {
        carBuilder.addWheels();
        assertThat(carBuilder.getWheels(), is(CarS.MESSAGE_BIG_WHEELS));
    }
}