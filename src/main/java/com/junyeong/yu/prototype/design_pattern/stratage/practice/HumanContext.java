package com.junyeong.yu.prototype.design_pattern.stratage.practice;

public class HumanContext {
	private Human human;
	public void setHuman(Human human) {
		this.human = human;
	}
	
	public void speak() {
		System.out.println("말하기전 심호홉~");
		human.speak();
	}

	public void smile() {
		System.out.println("웃기전에 웃긴이야기를 들어야지~");
		human.smile();
	}

	public void walk() {
		System.out.println("뭔가 먹는다.");
		human.walk();
	}
}