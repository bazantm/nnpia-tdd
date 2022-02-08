package com.hoaxifytdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) //vypnuti security
public class HoaxifyTddApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoaxifyTddApplication.class, args);
    }

}
