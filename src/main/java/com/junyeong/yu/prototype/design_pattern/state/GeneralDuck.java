package com.junyeong.yu.prototype.design_pattern.state;

public class GeneralDuck implements Duck {
	
	@SuppressWarnings("unused")
	private DuckService duckService;
	
	public GeneralDuck(DuckService duckService) {
		this.duckService = duckService;
	}
	
	public GeneralDuck() {}
	
	@Override
	public void speak() {
		System.out.println("나는 일반오리야 꽤에에엑~~~");
	}

	@Override
	public void fly() {
		System.out.println("나는 일반오리라서 잘날아~ 푸드덕푸드덕~");
	}
}
