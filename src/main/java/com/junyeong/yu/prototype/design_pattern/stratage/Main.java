package com.junyeong.yu.prototype.design_pattern.stratage;

import com.junyeong.yu.prototype.design_pattern.file.FileComponent;

public class Main {
	public static void main(String args[]) throws Exception {
		
		//1. General way
		Duck duck = new GeneralDuck();
		duck.fly();
		duck.scream();
		
		duck = new FakeDuck();
		duck.fly();
		duck.scream();
		
		duck = new RobotDuck();
		duck.fly();
		duck.scream();
		
		// 2. Strategy Pattern
		DuckService service = new DuckService();
		service.setDuck(new GeneralDuck());
		service.fly();
		service.scream();
		
		// 3. Developing more
		FileComponent fc = new FileComponent();
		String className = fc.getContent("text/classes.txt");
		Class c = Class.forName(className);

		DuckService duckService = new DuckService();
		duckService.setDuck((Duck)c.newInstance());
		duckService.fly();
		duckService.scream();
	}
}