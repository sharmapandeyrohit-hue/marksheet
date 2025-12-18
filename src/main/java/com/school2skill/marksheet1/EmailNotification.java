package com.school2skill.marksheet1;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationService {
    public void notifyStudent(String msg) {
        System.out.println("EMAIL: " + msg);
    }
}
