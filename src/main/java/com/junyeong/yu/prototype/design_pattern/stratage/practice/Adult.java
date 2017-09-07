package com.junyeong.yu.prototype.design_pattern.stratage.practice;

public class Adult implements Human {

	@Override
	public void speak() {
		System.out.println("여보세요~~");
	}

	@Override
	public void smile() {
		System.out.println("하하하하 호호호~~");
	}

	@Override
	public void walk() {
		System.out.println("터벅터벅~");
	}
}