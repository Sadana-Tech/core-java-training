package com.training.polymorphismDynamic;

public class Demo {

	public static void main(String args[]) {
		MacBook obj = new iPad();
		obj.myMethod();

		MacBook obj1 = new MacBook();
		obj1.myMethod();

		/*
		 * iPad obj2 = (iPad) new MacBook(); obj2.myMethod();
		 */
	}

}
