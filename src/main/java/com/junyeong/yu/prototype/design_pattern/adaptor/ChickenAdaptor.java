package com.junyeong.yu.prototype.design_pattern.adaptor;

import com.junyeong.yu.prototype.design_pattern.stratage.Duck;

public class ChickenAdaptor implements Duck {
	private Chicken chicken;
	
	public ChickenAdaptor(Chicken chicken) {
		this.chicken = chicken;
	}
	@Override
	public void scream() {
		chicken.cry();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			chicken.fly();
		}
	}
}