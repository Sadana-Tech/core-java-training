package com.training.staticvar;

public class DemoStaticVar {
	
	String s="czv";
	

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 12;
		s1.name = "Dev";
		Student.teacher = "Mr Ashok";
		Student s2 = new Student();
		s2.age = 14;
		s2.name = "Jackson";
		// No initialization of teacher for student s2
		//test();
	 //System.out.println(s);

		System.out.println(s1.name + ":" + s1.age + ":" + s1.teacher);
		System.out.println(s2.name + ":" + s2.age + ":" + s2.teacher);
		
	}
	
	public void test() {
		
	}


}
