package com.junyeong.yu.prototype.design_pattern.decorate.subquery;

public class Main {
	
	public static void main(String[] args) {
		TextParsor textParsor = new TextParsorDefault();
		textParsor.setText("(3 + 5 + (30 + 50) + (300 + 500))");
		System.out.println(textParsor.parseText());
		
		textParsor = new TextParsorBracket(new TextParsorBracket(textParsor));
		textParsor.setText("Test");
		System.out.println(textParsor.parseText());
		
		
	}
}