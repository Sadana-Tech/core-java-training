package com.training.encapsulation;

public class Student {

	public Student() {

	}

	public Student(String name) {
		this.name = name;

	}

	public Student(int age) {
		this.age = age;

	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;

	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
