package com.junyeong.yu.prototype.design_pattern.template;

public abstract class Beverage {
	
	public void beverageProccess() {
		
		if (isHot()) {
			prepareMeterial();
			boilWater();
			putMeterial();
			pourWater();
		}
		
		drink();
	}
	
	protected abstract void prepareMeterial();
	protected void boilWater() {
		System.out.println("2. 물을 끓인다.");
	}
	protected abstract void putMeterial();
	protected void pourWater() {
		System.out.println("4. 100도에서 물붓기");
	}
	protected void drink() {
		System.out.println("5. 마시기");
	}
	protected abstract boolean isHot();
}