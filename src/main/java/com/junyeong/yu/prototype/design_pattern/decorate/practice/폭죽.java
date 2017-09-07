package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public class 폭죽 extends CakeDecorator {
	
	public 폭죽(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public int cost() {
		return cake.cost() + 100;
	}
	
	@Override
	public String description() {
		return cake.description() + ", 폭죽 추가합니다";
	}
}