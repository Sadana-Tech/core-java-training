package com.training.polymorphismStatic;

public class DemoStaticPoly {
	
	public static void main(String args[])
	{
	Calculator obj = new Calculator();
	System.out.println(obj.add(100, 200));
	System.out.println(obj.add(100, 200, 300));
	}

}
