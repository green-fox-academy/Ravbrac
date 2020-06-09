package main.java.animals;

public class Bird extends Animal {
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
}
