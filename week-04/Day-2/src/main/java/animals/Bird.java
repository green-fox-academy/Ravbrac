package main.java.animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void eat() {
        System.out.println("Eats using it's beaks");
    }

    @Override
    public void drink() {
        System.out.println("Drinks using it's beaks");
    }

    @Override
    public void land() {
        System.out.println("Lands on legs");
    }

    @Override
    public void fly() {
        System.out.println("Flies with wings");
    }

    @Override
    public void takeOff() {
        System.out.println("Takes off with the help of it's legs");
    }
}
