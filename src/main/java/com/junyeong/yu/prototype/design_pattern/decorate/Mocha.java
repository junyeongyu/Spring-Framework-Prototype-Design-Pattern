package com.junyeong.yu.prototype.design_pattern.decorate;

public class Mocha extends CoffeeDacorator {
	public Mocha(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Mocha";
	}
	
	@Override
	public int cost() {
		return coffee.cost() + 200;
	}

}
