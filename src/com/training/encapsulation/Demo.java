package com.training.encapsulation;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student();
		Object obj = new Student("dzc");
		Student sObj = (Student) obj;
		System.out.println(sObj.getName());
		
		s.setName("Raghu");
		System.out.println(s.getName());
		s.age=10;
		System.out.println(s.age);
	}

}
