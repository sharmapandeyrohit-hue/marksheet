package com.school2skill.marksheet1;

import org.springframework.stereotype.Service;

@Service("esewa")
public class EsewaPaymentService implements PaymentService{
    @Override
    public void pay(PaymentRequest request) {
        System.out.println("Paid " + request.getAmount() + " using eSewa");
    }
}
