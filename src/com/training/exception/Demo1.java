package com.training.exception;

public class Demo1 {

	public void method() throws CustomCheckedExceptions {
		System.out.println("Checked");
	}

	public void method1() throws CustomUncheckedException {
		System.out.println("Unchecked");
	}
	
	
	public static void main(String args[]) {
		
		Demo1 ob = new Demo1();
		
		try {
			ob.method();
		} catch (CustomCheckedExceptions e) {
			
		}
		
		ob.method1();
	}

}
