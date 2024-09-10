package com.training.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      try {
	         System.out.print("Enter an integer: ");
	         int num = input.nextInt();
	         int reciprocal = 1 / 0;
	         System.out.println("The reciprocal of " + num + " is " + reciprocal);
	         String s=null;
	         System.out.println(s.charAt(1));
	      } catch (ArithmeticException e) {
	         System.out.println("Cannot divide by zero");
	      } catch (Exception e) {
	         System.out.println("Invalid input");
	      }finally {
			System.out.println("finally");
		}
	      
	   }

}
