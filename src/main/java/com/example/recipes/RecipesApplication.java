package com.example.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RecipesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RecipesApplication.class, args);


    }

}
