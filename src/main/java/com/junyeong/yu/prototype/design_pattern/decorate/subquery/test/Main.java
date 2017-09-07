package com.junyeong.yu.prototype.design_pattern.decorate.subquery.test;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expr = "3 + 5 + (30 + 50) + (300 + 500)";
		Expression expression = new Expression();
		expression.setParam(expr);
		
		System.out.println(expression.parse());
	}

}
