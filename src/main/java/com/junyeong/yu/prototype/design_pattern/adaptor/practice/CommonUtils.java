package com.junyeong.yu.prototype.design_pattern.adaptor.practice;

import java.util.Iterator;

public class CommonUtils {
	
	public static String concat(Iterator<String> it) {
		StringBuffer sb = new StringBuffer();
		while (it.hasNext()) {
			sb.append(it.next());
		}
		return sb.toString();
	}
}
