package com.junyeong.yu.prototype.design_pattern.decorate;

public class CaffeLatte extends Coffee {
	
	public CaffeLatte() {
		description = "CaffeLatee";
	}
	@Override
	public int cost() {
		return 2000;
	}
	
}
