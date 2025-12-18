package com.school2skill.marksheet1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class SystemLifecycle {


    @PostConstruct
    public void start() {
        System.out.println("Marksheet System Started");
    }


    @PreDestroy
    public void stop() {
        System.out.println("Marksheet System Stopped");
    }
}
