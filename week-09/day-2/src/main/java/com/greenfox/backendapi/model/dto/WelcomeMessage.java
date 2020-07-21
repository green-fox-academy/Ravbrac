package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class WelcomeMessage {

    private String welcome_message;

    public WelcomeMessage(String name, String title){
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}