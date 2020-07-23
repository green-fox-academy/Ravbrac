package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class YodaSpeak {
    String sith_text;

    public String switchWords(String text) {
        String[] sentences = text.split("\\.");
        String[][] words = (String[][]) Arrays.stream(sentences)
                .map(w -> w.split(" "))
                .toArray();

        return null;
    }
}
