package com.training.java8.lambdaexpr;

import java.util.ArrayList;

public class DemoLambdaCollections {

	public static void main(String args[]) {

		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);

		arrL.forEach(ele -> System.out.println(ele));

		// Print even
		System.out.println("Print even no");
		arrL.forEach(n -> {
			
			if (n % 2 == 0)
				System.out.println(n);
		});

	}

}
