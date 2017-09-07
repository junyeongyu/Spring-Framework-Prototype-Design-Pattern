package com.junyeong.yu.prototype.design_pattern.adaptor;

import kr.co.study.design.stratage.오리;

public class ChickenAdaptor implements 오리 {
	private Chicken chicken;
	
	public ChickenAdaptor(Chicken chicken) {
		this.chicken = chicken;
	}
	@Override
	public void 소리지르다() {
		chicken.cry();
	}

	@Override
	public void 날다() {
		for (int i = 0; i < 5; i++) {
			chicken.fly();
		}
	}
}