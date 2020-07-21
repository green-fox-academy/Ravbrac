package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AppendedWord {
    private String appended;

    public AppendedWord(String appendable) {
        this.appended = appendable + "a";
    }
}
