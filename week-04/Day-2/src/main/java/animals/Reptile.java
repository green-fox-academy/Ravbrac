package main.java.animals;

public class Reptile extends Animal {
    public Reptile(String name) {
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
        System.out.println("Eats in a cold-blooded way");
    }

    @Override
    public void drink() {
        System.out.println("Drinks in a cold-blooded way");
    }
}
