package com.school2skill.marksheet1;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements NotificationService {
    public void notifyStudent(String msg) {
        System.out.println("SMS: " + msg);
    }
}
