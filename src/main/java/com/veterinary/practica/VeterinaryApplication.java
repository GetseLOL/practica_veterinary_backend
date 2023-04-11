package com.veterinary.practica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeterinaryApplication implements CommandLineRunner {

    public static void main(String[] args)  {
        SpringApplication.run(VeterinaryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}
