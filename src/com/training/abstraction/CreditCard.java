package com.training.abstraction;

public class CreditCard extends PaymentMethod {

  public CreditCard(String paymentId, double amount, String currency) {
    super(paymentId, amount, currency);
  }


  public void chargeCustomer() {

    System.out.println("CC::Charging 2 percent");

  }


}
