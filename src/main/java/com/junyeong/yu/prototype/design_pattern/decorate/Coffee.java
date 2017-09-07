package com.junyeong.yu.prototype.design_pattern.decorate;

public abstract class Coffee {
	protected String description = "Default Description";
	public abstract int cost();
	public String getDescription() {
		return description;
	}
}
