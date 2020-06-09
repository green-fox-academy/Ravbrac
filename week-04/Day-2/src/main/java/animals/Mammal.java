package main.java.animals;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public void eat() {
        System.out.println("eats mammal-style");
    }

    @Override
    public void drink() {
        System.out.println("drinks mammal-style");
    }
}
