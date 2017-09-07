package com.junyeong.yu.prototype.design_pattern.state;

public class DuckService {
	
	// 1. 전략패턴때 사용한 오리
	private Duck duck;
	public void setDuck(Duck duck) {
		this.duck = duck;
	}
	
	// 2. 스테이트패턴때 오리들
	private Duck treeDuck;
	private Duck generalDuck;
	
	public DuckService() {
		treeDuck = new TreeDuck(this);
		generalDuck = new GeneralDuck(this);
		duck = treeDuck;
	}
	
	public void speak() {
		duck.speak();
	}
	
	public void fly() {
		duck.fly();
	}

	public Duck getTreeDuck() {
		return treeDuck;
	}

	public void setTreeDuck(Duck treeDuck) {
		this.treeDuck = treeDuck;
	}

	public Duck getGeneralDuck() {
		return generalDuck;
	}

	public void setGeneralDuck(Duck generalDuck) {
		this.generalDuck = generalDuck;
	}
}
