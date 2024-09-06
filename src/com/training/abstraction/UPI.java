package com.training.abstraction;

public class UPI extends PaymentMethod{

	public UPI(String paymentId, double amount, String currency) {
		super(paymentId, amount, currency);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chargeCustomer() {
		System.out.println("UPI:::No charges");
		
	}

}
