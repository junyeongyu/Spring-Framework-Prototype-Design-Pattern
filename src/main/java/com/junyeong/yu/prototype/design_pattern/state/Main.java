package com.junyeong.yu.prototype.design_pattern.state;

public class Main {

	public static void main(String[] args) {
		
		// 1. 전략패턴인 경우
		DuckService duckService = new DuckService();
		duckService.setDuck(new TreeDuck());
		duckService.speak();
		duckService.fly();
		duckService.fly();
		
		System.out.println("=============================");
		
		duckService.setDuck(new GeneralDuck());
		duckService.speak();
		duckService.fly();
		duckService.fly();
		
		System.out.println("=============================");
		
		
		// 2. 스테이트패턴인 경우
		DuckService duckServiceState = new DuckService();
		//duckServiceState.setDuck(new TreeDuck(duckServiceState));
		duckServiceState.speak();
		duckServiceState.fly();
		duckServiceState.speak();
		duckServiceState.fly();
		
		System.out.println("=============================");
	}

}
