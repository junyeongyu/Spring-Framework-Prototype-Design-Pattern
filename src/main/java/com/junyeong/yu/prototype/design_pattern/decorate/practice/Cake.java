package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public abstract class Cake {
	
	protected String bread;
	
	public abstract int cost();
	public abstract String description();
	
	public String getBread() {
		return this.bread;
	}
}
