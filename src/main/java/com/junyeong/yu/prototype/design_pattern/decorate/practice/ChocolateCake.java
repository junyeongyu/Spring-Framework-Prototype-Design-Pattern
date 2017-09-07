package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public class ChocolateCake extends Cake {
	public ChocolateCake() {
		this.bread = "초콜릿케익용빵";
	}
	@Override
	public int cost() {
		return 15000;
	}

	@Override
	public String description() {
		return "이건 초콜릿 케이크입니다";
	}
}