package com.junyeong.yu.prototype.design_pattern.builder.practice.models;

import com.junyeong.yu.prototype.design_pattern.builder.practice.structs.CarS;

public class CarBmw extends CarA {

    @Override
    public String getBrand() {
        return CarS.BMW_BRAND;
    }
}
