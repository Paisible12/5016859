package com.example.adapter.impl;

import com.example.adapter.PaymentProcessor;
import com.example.adaptee.Stripe;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.pay(amount);
    }
}
