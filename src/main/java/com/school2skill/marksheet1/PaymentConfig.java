package com.school2skill.marksheet1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
    @Bean
    @ConditionalOnProperty(name = "payment.type", havingValue = "esewa")
    public PaymentService esewa() {
        return new EsewaPaymentService();
    }


    @Bean
    @ConditionalOnProperty(name = "payment.type", havingValue = "khalti")
    public PaymentService khalti() {
        return new KhaltiPaymentService();
    }
}
