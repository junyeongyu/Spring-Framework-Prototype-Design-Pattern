package com.junyeong.yu.prototype.design_pattern.decorate;

public abstract class CoffeeDacorator extends Coffee {
	protected Coffee coffee;
	public abstract String getDescription();
}
