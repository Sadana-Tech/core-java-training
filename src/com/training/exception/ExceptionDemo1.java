package com.training.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	    try {
	    	 System.out.print("Enter an integer: ");
	         int num = input.nextInt();
	         int reciprocal = 1 / 0;
	         System.out.println("The reciprocal of " + num + " is " + reciprocal);
	         String s=null;
	         System.out.println(s.charAt(1));

	    } catch (NullPointerException | ArithmeticException | InputMismatchException e) {
	        System.out.println("Caught Specific Exception: " + e.getMessage());

	    }  finally {
	        System.out.println("Finally block always executes.");
	    }
	}

}
