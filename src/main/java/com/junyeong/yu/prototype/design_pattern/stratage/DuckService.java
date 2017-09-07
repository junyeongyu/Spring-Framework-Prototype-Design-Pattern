package com.junyeong.yu.prototype.design_pattern.stratage;

import org.springframework.beans.factory.annotation.Autowired;

public class DuckService {
	
	@Autowired
	private Duck duck;
	public void setDuck(Duck duck) {
		this.duck = duck;
	}
	
	public void scream() {
		System.out.println("Scream in duck service");
		duck.scream();
	}
	public void fly() {
		System.out.println("Fly in duck service");
		duck.fly();
	}
}