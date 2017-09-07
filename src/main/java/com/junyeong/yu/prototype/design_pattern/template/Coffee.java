package com.junyeong.yu.prototype.design_pattern.template;

public class Coffee extends Beverage {
	
	@Override
	protected void prepareMeterial() {
		System.out.println("1. 커피와 프리마와 설탕등 재료를 준비한다.");
	}
	
	@Override
	protected void putMeterial() {
		System.out.println("3. 커피와 프리마를 적절히 섞어서 넣는다.");
	}
	
	@Override
	protected boolean isHot() {
		return true;
	}
}