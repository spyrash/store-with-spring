package com.examplestore.store;

import org.springframework.stereotype.Service;

//@Service can't have multiple autowiring!
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("amount: " + amount);
    }
}
