package com.school2skill.marksheet1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Marksheet1Application implements CommandLineRunner {
    @Autowired
    PaymentProcessor processor;

	public static void main(String[] args) {
		SpringApplication.run(Marksheet1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
    processor.processPayment(500);
    }
//    1. Spring starts application
//2. Bean objects are created
//3. Dependencies are injected (@Autowired)
//4. @PostConstruct method runs
//5. processPayment() is called
//6. Payment happens (eSewa/Khalti)
//7. Application stops
//8. @PreDestroy method runs

//    ✔ What is a POJO
//✔ How Spring creates a Bean
//✔ How @Autowired works
//✔ How @PostConstruct & @PreDestroy work
//✔ How business logic runs
//✔ Where the application starts
}
//new PaymentProcessor()        ← Bean Created
//@Autowired injection          ← Dependency Injected
//@PostConstruct start()        ← Bean Initialized
//processPayment()              ← Bean Used
//@PreDestroy stop()            ← Bean Destroyed
