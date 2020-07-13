package com.greenfox.databaseintegration;

import com.greenfox.databaseintegration.model.Todo;
import com.greenfox.databaseintegration.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseIntegrationApplication implements CommandLineRunner {

    private TodoRepository repository;

    @Autowired
    public DatabaseIntegrationApplication(TodoRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("I have to learn Object Relational Mapping"));
        repository.save(new Todo("I have to learn H2"));
        repository.save(new Todo("I have to learn JPA"));
        repository.save(new Todo("I have to learn CRUD"));
    }


}
