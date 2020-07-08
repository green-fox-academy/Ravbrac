package com.greenfox.dependencies;

import org.springframework.stereotype.Service;


public class BlueColor extends Color implements MyColor {
    public BlueColor() {
        this.color = "blue";
    }
}
