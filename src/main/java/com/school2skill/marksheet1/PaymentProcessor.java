package com.school2skill.marksheet1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {
    @Autowired
    @Qualifier("khalti")
    private PaymentService paymentService;

    public void processPayment(int amount){
        PaymentRequest paymentRequest=new PaymentRequest(amount);
        paymentService.pay(paymentRequest);
    }
}
