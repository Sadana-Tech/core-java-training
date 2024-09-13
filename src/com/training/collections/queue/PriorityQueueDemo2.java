package com.training.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {

	public static void main(String args[]) {

		Queue<Employee> pq = new PriorityQueue<>(new EmployeeComaprator());
		pq.add(new Employee("Ram", 1, 3));
		pq.add(new Employee("Sham", 2, 4));
		pq.add(new Employee("Krish", 3, 5));
		pq.add(new Employee("Ved", 4, 2));
		pq.add(new Employee("Krid", 5, 2));
		pq.add(new Employee("Shiv", 6, 1));
		pq.add(new Employee("Anji", 7, 5));

		int length = pq.size();
		for (int i = 0; i < length; i++) {
			System.out.println(pq.poll().toString());

		}

	}

}
