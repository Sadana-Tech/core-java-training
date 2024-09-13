package com.training.collections.queue;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String args[]) {

		Set<Employee> treeset = new TreeSet<>(new EmployeeComaprator());
		treeset.add(new Employee("Ram", 1, 1));
		treeset.add(new Employee("erew", 3, 4));
		treeset.add(new Employee("er", 4, 2));
		treeset.add(new Employee("er", 2, 6));
		treeset.add(new Employee("wrew", 7, 7));
		treeset.add(new Employee("Rrewr", 6, 9));

		Iterator<Employee> itr1 = treeset.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
