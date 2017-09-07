package com.junyeong.yu.prototype.design_pattern.decorate;

public class Americano extends Coffee {
	
	public Americano() {
		description = "americano";
	}
	
	@Override
	public int cost() {
		return 1000;
	}
}
