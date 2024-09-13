package com.training.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String args[]) {
		
		Queue<Integer> que = new LinkedList<>();
		
		que.add(100);
		que.add(200);
		que.add(300);
		que.add(400);
		
		System.out.println(que.remove());
		
		System.out.println(que.peek());
	}
}
