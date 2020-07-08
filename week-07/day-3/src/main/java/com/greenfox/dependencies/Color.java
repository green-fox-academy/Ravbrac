package com.greenfox.dependencies;


import org.springframework.beans.factory.annotation.Autowired;

public abstract class Color implements MyColor {
    String color;
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
//        System.out.println("It is " + color + " in color");
        printer.log(color);
    }
}
