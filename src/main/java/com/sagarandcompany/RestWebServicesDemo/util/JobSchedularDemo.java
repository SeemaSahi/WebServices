package com.sagarandcompany.RestWebServicesDemo.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JobSchedularDemo {
    //@Scheduled(fixedRate = 1000)
    public void print() {
        System.out.println(" job time" + new Date());
    }
}
