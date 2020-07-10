package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    List<Fox> foxes;

    public FoxService() {
        this.foxes = new ArrayList<>();
    }

    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

    public Optional<Fox> findFox(String name) {
        return foxes.stream()
                .filter(f -> f.getName().equals(name))
                .findFirst();
    }
}
