package garden_application;

public class Main {
    public static void main(String[] args) {
//        The task is to create a garden application, so in your main method you should create a garden with flowers and
//        trees. The program should demonstrate an example garden with two flowers (yellow and blue) and two trees
//        (purple and orange). In the example after creating them you should show the user, how the garden looks like.
//        After that the program should water the garden twice, first with the amount of 40 then with 70. And after every
//        watering the user should see the state of the garden as you can see in the output.

        Garden garden = new Garden();
        garden.addFlower(new Flower("yellow"));
        garden.addFlower(new Flower("blue"));
        garden.addTree(new Tree("purple"));
        garden.addTree(new Tree("orange"));

        garden.gardenInfo();
        System.out.println();

        garden.waterPlants(40);
        garden.gardenInfo();
        System.out.println();
        garden.waterPlants(70);
        garden.gardenInfo();
    }
}
