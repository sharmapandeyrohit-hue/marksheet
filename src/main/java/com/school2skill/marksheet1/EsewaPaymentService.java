package com.school2skill.marksheet1;

import org.springframework.stereotype.Service;

public class EsewaPaymentService implements PaymentService{
    @Override
    public boolean payFee(int amount) {
        System.out.println("Paid " + amount + " via eSewa");
        return true;
    }
}
