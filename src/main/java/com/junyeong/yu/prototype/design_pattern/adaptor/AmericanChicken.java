package com.junyeong.yu.prototype.design_pattern.adaptor;

public class AmericanChicken implements Chicken {

	@Override
	public void cry() {
		System.out.println("치킨이 울었다.");
	}
	
	@Override
	public void fly() {
		System.out.println("치킨이 날려고 시도하다.");
	}
}