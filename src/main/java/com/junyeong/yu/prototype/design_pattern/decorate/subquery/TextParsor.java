package com.junyeong.yu.prototype.design_pattern.decorate.subquery;

public abstract class TextParsor {
	protected String text = "";
	
	public void setText(String text) {
		this.text = text;
	}
	public abstract String parseText();
}
