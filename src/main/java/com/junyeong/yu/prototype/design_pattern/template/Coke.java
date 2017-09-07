package com.junyeong.yu.prototype.design_pattern.template;

public class Coke extends Beverage {

	@Override
	protected void prepareMeterial() {
		System.out.println("1. 돈을 준비한다.");
	}

	@Override
	protected void putMeterial() {
		System.out.println("3. 돈을 넣는다.");
	}

	@Override
	protected boolean isHot() {
		return false;
	}

}