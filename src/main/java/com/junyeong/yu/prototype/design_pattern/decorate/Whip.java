package com.junyeong.yu.prototype.design_pattern.decorate;

public class Whip extends CoffeeDacorator {
	public Whip(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Whip";
	}

	@Override
	public int cost() {
		return coffee.cost() + 300;
	}


}
