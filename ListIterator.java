package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		for(String alpha:list) {
			System.out.println(alpha);
		}
		
		list.forEach (alpha -> System.out.println(alpha));

	}

}
