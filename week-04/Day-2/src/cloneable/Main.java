package cloneable;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");

        try {
            Student johnTheClone = (Student) john.clone();
            System.out.println(johnTheClone.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
