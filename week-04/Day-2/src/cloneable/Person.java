package cloneable;

public class Person implements Cloneable {
//    Create a Person class with the following fields:
//
//    name: the name of the person
//    age: the age of the person (whole number)
//    gender: the gender of the person (male / female)
//    And the following methods:
//
//    introduce(): prints out "Hi, I'm name, a age year old gender."
//    getGoal(): prints out "My goal is: Live for the moment!"
//    And the following constructors:
//
//    Person(name, age, gender)
//    Person(): sets name to Jane Doe, age to 30, gender to female

    String name;
    int age;
    String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + introduceSpecial());
    }

    public String introduceSpecial() {
        return "";
    }

    public void getGoal() {
        System.out.println("My goal is: " + getGoalSpecial());
    }

    public String getGoalSpecial() {
        return "Live for the moment!";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
