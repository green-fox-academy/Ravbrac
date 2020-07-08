package com.greenfox.dependencies;

import org.springframework.stereotype.Service;

@Service
public class RedColor extends Color implements MyColor {

    public RedColor() {
        this.color = "red";
    }
}
