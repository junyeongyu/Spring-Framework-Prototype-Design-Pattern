package com.junyeong.yu.prototype.design_pattern.decorate.practice;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cake chocolateCake = new ChocolateCake();
		System.out.println(chocolateCake.cost() + ":" + chocolateCake.description());
		
		chocolateCake = new Candle(new 폭죽(chocolateCake));
		chocolateCake = new Candle(new 폭죽(chocolateCake));
		chocolateCake = new Candle(new 폭죽(chocolateCake));
		chocolateCake = new Candle(new 폭죽(chocolateCake));
		chocolateCake = new 폭죽(new Candle(new 폭죽(new Candle(new 폭죽(chocolateCake)))));
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		chocolateCake = new 폭죽(chocolateCake);
		
		System.out.println(chocolateCake.cost() + ":" + chocolateCake.description());
		
		System.out.println(chocolateCake.getBread());
		
	}
}