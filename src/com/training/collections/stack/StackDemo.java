package com.training.collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(100);
		stack.add(200);
		stack.add(300);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

	}

}
