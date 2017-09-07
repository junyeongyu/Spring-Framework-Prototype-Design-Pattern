package com.junyeong.yu.prototype.design_pattern.stratage.practice;

public class GrandMother implements Human {

	@Override
	public void speak() {
		System.out.println("아이구~~ 허리야~");
	}

	@Override
	public void smile() {
		System.out.println("허허허허~");
	}

	@Override
	public void walk() {
		System.out.println("아이구야 걷기 힘들구나~~");
	}
}