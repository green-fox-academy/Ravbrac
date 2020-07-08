package com.greenfox.dependencies;

import org.springframework.stereotype.Service;


public class GreenColor extends Color implements MyColor {
    public GreenColor() {
        this.color = "green";
    }
}
