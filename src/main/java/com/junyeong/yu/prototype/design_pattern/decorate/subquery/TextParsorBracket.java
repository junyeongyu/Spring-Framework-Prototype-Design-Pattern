package com.junyeong.yu.prototype.design_pattern.decorate.subquery;

public class TextParsorBracket extends TextParsorDecorator {
	
	public TextParsorBracket(TextParsor textParsor) {
		this.textParsor = textParsor;
	}	
	@Override
	public String parseText() {
		return "(" + textParsor.parseText() + ")";
	}
}
