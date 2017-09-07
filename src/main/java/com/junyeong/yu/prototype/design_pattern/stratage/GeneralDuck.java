package com.junyeong.yu.prototype.design_pattern.stratage;

public class GeneralDuck implements Duck {
	public void scream() {
		System.out.println("Quack Quack");
	}
	public void fly() {
		System.out.println("Fly~ Fly~");
	}
}