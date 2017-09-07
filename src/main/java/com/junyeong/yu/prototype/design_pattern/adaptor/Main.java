package com.junyeong.yu.prototype.design_pattern.adaptor;

import java.util.ArrayList;
import java.util.List;

import kr.co.study.design.stratage.모형오리;
import kr.co.study.design.stratage.오리;
import kr.co.study.design.stratage.일반오리;

public class Main {

	public static void main(String[] args) {
		List<오리> 오리리스트 = new ArrayList<오리>();
		오리리스트.add(new ChickenAdaptor(new AmericanChicken()));
		오리리스트.add(new 일반오리());
		오리리스트.add(new 모형오리());
		
		// 받는쪽에서는
		for (int i = 0; i < 오리리스트.size(); i++) {
			오리 duck = 오리리스트.get(i);
			duck.날다();
			duck.소리지르다();
		}
	}
}