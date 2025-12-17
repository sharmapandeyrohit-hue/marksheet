package com.school2skill.marksheet1;

import org.springframework.stereotype.Service;

@Service("khalti")
public class KhaltiPaymentService implements PaymentService{
    @Override
    public void pay(PaymentRequest request) {
        System.out.println("Paid "+request.getAmount()+"using khalti");
    }
}
