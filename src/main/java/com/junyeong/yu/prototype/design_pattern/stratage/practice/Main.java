package com.junyeong.yu.prototype.design_pattern.stratage.practice;

public class Main {

	public static void main(String[] args) {
		Human human = new GrandMother();//new Baby();//new Adult();
		HumanContext humanContext = new HumanContext();
		humanContext.setHuman(human);
		humanContext.smile();
		humanContext.speak();
		humanContext.walk();
	}
}