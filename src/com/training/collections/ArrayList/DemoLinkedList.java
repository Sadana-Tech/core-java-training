package com.training.collections.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
	
	public static void main(String args[]) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(0, 20);
		list.addAll(list);
		System.out.println(list.toString());
		
		Iterator<Integer> itr = list.listIterator(2);
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		
		
		
	}

}
