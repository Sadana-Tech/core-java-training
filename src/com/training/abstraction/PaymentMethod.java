package com.training.abstraction;

public abstract class PaymentMethod {

  protected String paymentId;
  protected double amount;
  protected String currency;

  public PaymentMethod(String paymentId, double amount, String currency) {
    this.paymentId = paymentId;
    this.amount = amount;
    this.currency = currency;
  }

  public boolean validatePayment() {
    // Validate the payment details, such as the amount, currency, and payment ID
    return true;
  }

  public abstract void chargeCustomer();



}
