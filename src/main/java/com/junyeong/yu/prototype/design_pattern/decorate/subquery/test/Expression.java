package com.junyeong.yu.prototype.design_pattern.decorate.subquery.test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Expression {
	
	private List<Expression> expressionList = new ArrayList<Expression>();
	
	private String param;
	public void setParam(String param) {
		spread();
		this.param = param;
	}
	
	public void spread() {
		int firstIndex = param.indexOf("(");
		int lastIndex = param.lastIndexOf(")");
		if (firstIndex != -1 && lastIndex != -1) {
			
		}
	}
	
	public String parse() {
		StringTokenizer st = new StringTokenizer(param, "+"/*=-*^/"*/);
		int total = 0;
		while(st.hasMoreTokens()) {
			total = total + Integer.valueOf(st.nextToken().trim());
		}
		return (this.expressionList == null ? "" : this.expressionList.get(0).parse()) + String.valueOf(total);
	}
}
