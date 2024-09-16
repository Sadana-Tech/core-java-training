package com.training.collections.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TressSetDemo {

	public static void main(String args[]) {

		Set<Integer> treeset = Collections.synchronizedSet(new TreeSet<>());
		treeset.add(10);
		treeset.add(2);
		treeset.add(5);
		treeset.add(20);

		for (Integer i : treeset) {
			System.out.println(i);
		}

		Iterator<Integer> itr = treeset.iterator();
		while (itr.hasNext()) {
			treeset.add(60);
			System.out.println(itr.next());
		}

		Set<String> set = new TreeSet<>();
		set.add("sda");
		set.add("sdfds");
		set.add("vsdf");
		set.add("qc");

		Iterator<String> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
