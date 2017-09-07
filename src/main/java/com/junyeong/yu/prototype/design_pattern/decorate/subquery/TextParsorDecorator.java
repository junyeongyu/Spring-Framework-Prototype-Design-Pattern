package com.junyeong.yu.prototype.design_pattern.decorate.subquery;

public abstract class TextParsorDecorator extends TextParsor {
	protected TextParsor textParsor;
	
	@Override
	public void setText(String text) {
		this.textParsor.setText(text);
	}
}
