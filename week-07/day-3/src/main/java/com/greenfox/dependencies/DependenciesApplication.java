package com.greenfox.dependencies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    Printer printer = new Printer();

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
    }
}
