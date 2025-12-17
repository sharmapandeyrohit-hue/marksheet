package com.school2skill.marksheet1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentLifecycleLogger {
    @PostConstruct
    public void init(){
        System.out.println("Payment system initialized");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Payment system destroy");}
}
