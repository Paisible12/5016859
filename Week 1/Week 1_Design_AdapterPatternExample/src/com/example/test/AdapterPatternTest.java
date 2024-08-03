package com.example.test;

import com.example.adapter.PaymentProcessor;
import com.example.adapter.impl.PayPalAdapter;
import com.example.adapter.impl.StripeAdapter;
import com.example.adaptee.PayPal;
import com.example.adaptee.Stripe;

public class AdapterPatternTest {
    public static void main(String[] args) {
        
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();


        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
