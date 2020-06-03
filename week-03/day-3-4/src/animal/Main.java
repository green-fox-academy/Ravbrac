package animal;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Animal();
        System.out.println("Bear Hunger: " + bear.getHunger());
        System.out.println("Bear Thirst: " + bear.getThirst());
        bear.play();

        for (int i = 0; i < 10; i++) {
            bear.eat();
        }
        System.out.println("Bear Hunger: " + bear.getHunger());
        System.out.println("Bear Thirst: " + bear.getThirst());

        Animal wolf = new Animal();
        System.out.println("Wolf Hunger: " + wolf.getHunger());
        System.out.println("Wolf Thirst: " + wolf.getThirst());
    }
}
