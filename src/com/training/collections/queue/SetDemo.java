package com.training.collections.queue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String args[]) {

		Set<Integer> set = new HashSet<>();		
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(null);
		set.add(40);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			

	}

	
	
}
