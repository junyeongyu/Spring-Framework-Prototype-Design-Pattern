package com.junyeong.yu.prototype.design_pattern.decorate;

public class Main {
	public static void main(String[] args) {
		Coffee coffee = new Americano();
		System.out.println(coffee.cost());
		System.out.println(coffee.getDescription());
		
		coffee = new Whip(new Mocha(coffee));
		System.out.println(coffee.cost());
		System.out.println(coffee.getDescription());
	}
}