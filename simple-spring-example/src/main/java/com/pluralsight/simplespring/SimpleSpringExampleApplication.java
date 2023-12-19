package com.pluralsight.simplespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringExampleApplication implements CommandLineRunner {

    @Autowired
    private FortuneTeller fortuneTeller;
    @Autowired @Qualifier("Ordinary")//instantiates of implementation of PetDAO
    private PetDAO petDAO;

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        System.out.println(fortuneTeller.predictTheFuture());

        Pet p = petDAO.getPetByID();
        System.out.println(p.toString());
    }


}
