package com.desenrolaifsc.desenrolaifsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.desenrolaifsc.desenrolaifsc.model")
public class DesenrolaifscApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesenrolaifscApplication.class, args);
    }

}