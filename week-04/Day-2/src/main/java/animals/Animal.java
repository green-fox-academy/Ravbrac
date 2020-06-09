package main.java.animals;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String gender;
    protected int numberOfLegs;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract String breed();

    public abstract void eat();

    public abstract void drink();

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
