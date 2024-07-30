package com.example.test;

import com.example.context.PaymentContext;
import com.example.strategy.CreditCardPayment;
import com.example.strategy.PayPalPayment;
import com.example.strategy.PaymentStrategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567812345678");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");

        System.out.println("Paying with Credit Card:");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100.0);

        System.out.println("Paying with PayPal:");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200.0);
    }
}
