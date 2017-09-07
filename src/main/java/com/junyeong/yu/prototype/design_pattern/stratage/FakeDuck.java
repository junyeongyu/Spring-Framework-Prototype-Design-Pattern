package com.junyeong.yu.prototype.design_pattern.stratage;

public class FakeDuck implements Duck {
	public void scream() {
		System.out.println("fake scream~~~");
	}
	public void fly() {
		System.out.println("i cannot fly~~");
	}
}