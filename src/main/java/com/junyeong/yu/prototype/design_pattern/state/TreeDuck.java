package com.junyeong.yu.prototype.design_pattern.state;

public class TreeDuck implements Duck {
	
	private DuckService duckService;
	public TreeDuck(DuckService duckService) {
		this.duckService = duckService;
	}
	
	public TreeDuck() {}
	
	@Override
	public void speak() {
		System.out.println("난 나무라서 말할수 없어~ 마음으로 이야기하지~");
	}

	@Override
	public void fly() {
		System.out.println("원래는 날수 없지 하지만~ 이제는 ~ 달라질꺼야~");
		if (duckService != null) {
			duckService.setDuck(duckService.getGeneralDuck());
		}
	}
}
