package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public class CreamCake extends Cake {
	
	public CreamCake() {
		this.bread = "크림케익용빵";
	}
	@Override
	public int cost() {
		return 10000;
	}

	@Override
	public String description() {
		return "이건 생크림 케이크입니다";
	}
}