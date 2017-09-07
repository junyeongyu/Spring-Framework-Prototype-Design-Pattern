package com.junyeong.yu.prototype.design_pattern.adaptor;

import java.util.ArrayList;
import java.util.List;

import com.junyeong.yu.prototype.design_pattern.stratage.Duck;
import com.junyeong.yu.prototype.design_pattern.stratage.FakeDuck;
import com.junyeong.yu.prototype.design_pattern.stratage.GeneralDuck;

public class Main {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new ChickenAdaptor(new AmericanChicken()));
		ducks.add(new GeneralDuck());
		ducks.add(new FakeDuck());
		
		// 받는쪽에서는
		for (int i = 0; i < ducks.size(); i++) {
			Duck duck = ducks.get(i);
			duck.fly();
			duck.scream();
		}
	}
}