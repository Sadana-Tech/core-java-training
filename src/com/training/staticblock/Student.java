package com.training.staticblock;

public class Student {
	int age;
	String name;
	static String teacher;
	static {
		System.out.println("I am inside static block");
	}

	public Student() {
		System.out.println(" I am inside default constructor");
	}

}
