package com.training.polymorphismDynamic;

public class Demo {

	public static void main(String args[]) {
		Mac obj = new iPad();
		obj.myMethod();

		Mac obj1 = new Mac();
		obj1.myMethod();

		/*
		 * iPad obj2 = (iPad) new MacBook(); obj2.myMethod();
		 */

	}

}
