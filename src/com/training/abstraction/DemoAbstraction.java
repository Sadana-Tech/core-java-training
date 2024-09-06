package com.training.abstraction;

public class DemoAbstraction {
	
	public static void main(String args[]) {
		PaymentMethod paymentMethod = new UPI("TrnId123", 10, "INR");
		paymentMethod.validatePayment();
		paymentMethod.chargeCustomer();
		
		PaymentMethod paymentMethod1 = new CreditCard("TrnId123", 10, "INR");
		paymentMethod1.validatePayment();
		paymentMethod1.chargeCustomer();
		
		
	}

}
