package com.sagarandcompany.RestWebServicesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestWebServicesDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestWebServicesDemoApplication.class, args);
    }
}
