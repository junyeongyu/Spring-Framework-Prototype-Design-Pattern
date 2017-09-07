package com.junyeong.yu.prototype.design_pattern.adaptor.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("값A");
		list.add("값AA");
		
		Vector<String> vector = new Vector<String>();
		vector.add("값B");
		vector.add("값BB");
		
		Iterator<String> it = list.iterator();
		Iterator<String> em = new EnumerationAdaptor(vector.elements());
		
		System.out.println(CommonUtils.concat(it));
		System.out.println(CommonUtils.concat(em));
		//CommonUtils.concat(em);
		
		List<Iterator<String>> itList = new ArrayList<Iterator<String>>();
		itList.add(it);
		itList.add(em);
		
		
		for (int i = 0; i < itList.size(); i++) {
			System.out.println(CommonUtils.concat(itList.get(i)));
		}
	}
}