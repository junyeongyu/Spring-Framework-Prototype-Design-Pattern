package com.junyeong.yu.prototype.design_pattern.adaptor.practice;

import java.util.Enumeration;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class EnumerationAdaptor implements Iterator {
	private Enumeration enumeration;
	public EnumerationAdaptor(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
