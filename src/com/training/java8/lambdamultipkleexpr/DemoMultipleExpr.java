package com.training.java8.lambdamultipkleexpr;


interface Operation{
	int operation(int x, int y);
	
}

public class DemoMultipleExpr {

	public static void main(String[] args) {
		
		Operation add = (a,b) -> a+b;
		Operation mul = (a,b) -> a*b;
		
		System.out.println(add.operation(2, 3));
		System.out.println(mul.operation(2, 3));

	}

}
