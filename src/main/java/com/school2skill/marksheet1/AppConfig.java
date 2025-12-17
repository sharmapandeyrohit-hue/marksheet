package com.school2skill.marksheet1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentRequest demoPayment(){
    return new PaymentRequest(1000);
    }
}
