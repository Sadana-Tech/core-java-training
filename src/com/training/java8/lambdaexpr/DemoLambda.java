package com.training.java8.lambdaexpr;


@FunctionalInterface
interface FunInterface {	
	
	void doubleEle(int x);

	default void printHello() {
		System.out.println("Hello");
	}
	
	default void printHello1() {
		System.out.println("Hello");
	}
	

}

public class DemoLambda {

	public static void main(String args[]) {
		
		FunInterface obj = (int x) -> System.out.println(2 * x);
		obj.doubleEle(5);
		obj.printHello();
	}

}
