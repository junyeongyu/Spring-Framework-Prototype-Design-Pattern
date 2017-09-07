package com.junyeong.yu.prototype.design_pattern.stratage.practice;

public class Baby implements Human {

	@Override
	public void speak() {
		System.out.println("응애~~");
	}

	@Override
	public void smile() {
		System.out.println("까르르~");
	}

	@Override
	public void walk() {
		System.out.println("아장아장~");
	}
}