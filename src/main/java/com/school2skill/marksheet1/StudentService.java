package com.school2skill.marksheet1;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {


    private final PaymentService paymentService;
    private final Map<String, NotificationService> notifications;


    public StudentService(PaymentService paymentService,
                          Map<String, NotificationService> notifications) {
        this.paymentService = paymentService;
        this.notifications = notifications;
    }


    public Marksheet viewMarksheet(Student student) {
        boolean paid = paymentService.payFee(1000);


        if (paid) {
            notifications.values().forEach(n ->
                    n.notifyStudent("Fee received. Marksheet unlocked for " + student.getName())
            );
            return new Marksheet("PASS");
        }
        return new Marksheet("PAYMENT PENDING");
    }
}