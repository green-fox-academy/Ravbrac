package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class SimpleText {
    String text;

    public SimpleText(String text) {
        this.text = text;
    }
}
