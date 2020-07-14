package com.greenfox.foxclub.service;


import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TrickService {
    private List<String> tricks;

    public TrickService() {
        this.tricks = new ArrayList<>(Arrays.asList(
                "write HTML",
                "Java",
                "C++",
                "Python"
        ));
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public Optional<String> findTrick(String trick) {
        return tricks.stream()
                .filter(t -> t.equals(trick))
                .findFirst();
    }

    public List<String> newTricks(List<String> knownTricks) {
        List<String> unknownTricks = tricks;
        unknownTricks.removeAll(knownTricks);
        return unknownTricks;
    }
}
