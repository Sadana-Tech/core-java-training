package com.training.collections.queue;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String args[]) {

		Set<Integer> set = new LinkedHashSet<>();

		set.add(10);
		set.add(30);
		set.add(5);
		set.add(40);

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
