package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public class Candle extends CakeDecorator {
	
	public Candle(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public int cost() {
		return cake.cost() + 2000;
	}
	
	@Override
	public String description() {
		return cake.description() + ", 양초 추가합니다";
	}
}