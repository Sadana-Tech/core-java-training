package com.training.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueueDemo {

	public static void main(String args[]) {
		
		Deque<Integer> dequ= new ArrayDeque<>();
		dequ.addFirst(100);
		dequ.addLast(200);;
		dequ.addFirst(300);
		
		System.out.println(dequ.removeFirst());
		System.out.println(dequ.removeLast());
	}
	
	
}
