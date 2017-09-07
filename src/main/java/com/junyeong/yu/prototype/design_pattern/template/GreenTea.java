package com.junyeong.yu.prototype.design_pattern.template;

public class GreenTea extends Beverage {

	@Override
	protected void prepareMeterial() {
		System.out.println("1. 잎사귀와 주머니등 재료를 준비한다.");
	}

	@Override
	protected void putMeterial() {
		System.out.println("3. 잎사귀를 정성스럽게 빻아서 넣는다.");
	}

	@Override
	protected boolean isHot() {
		return true;
	}
}