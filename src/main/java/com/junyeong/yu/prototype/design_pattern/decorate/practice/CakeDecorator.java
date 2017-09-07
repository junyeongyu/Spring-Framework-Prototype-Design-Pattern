package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public abstract class CakeDecorator extends Cake {
	protected Cake cake;
	
	@Override
	public String getBread() {
		return cake.getBread();
	}
	
	public abstract int cost();
	public abstract String description();

}
