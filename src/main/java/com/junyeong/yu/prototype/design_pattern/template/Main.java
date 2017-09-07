package com.junyeong.yu.prototype.design_pattern.template;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("녹차만들기");
		Beverage greenTea = new GreenTea();
		greenTea.beverageProccess();
		
		System.out.println();
		System.out.println("커피만들기");
		Beverage coffee = new Coffee();
		coffee.beverageProccess();
		
		System.out.println();
		System.out.println("콜라만들기");
		Beverage coke = new Coke();
		coke.beverageProccess();
	}
}