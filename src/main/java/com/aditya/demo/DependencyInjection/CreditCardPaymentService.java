package com.aditya.demo.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentService implements PaymentService {

    @Override
    public void payment() {
        System.out.println("Payment completed using credit card");
    }
}