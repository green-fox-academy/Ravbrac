package farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm(5);

        farm.breed();
        System.out.println(farm.animals.size());
        farm.breed();
        System.out.println(farm.animals.size());
        farm.breed();
        System.out.println(farm.animals.size());
        farm.breed();
        System.out.println(farm.animals.size());
        farm.breed();
        System.out.println(farm.animals.size());
        farm.breed();
        System.out.println(farm.animals.size());


        for (int i = 0; i < 5; i++) {
            farm.animals.get(1).play();
        }
        for (int i = 0; i < 10; i++) {
            farm.animals.get(3).play();
        }
        for (int i = 0; i < farm.animals.size(); i++) {
            System.out.print(farm.animals.get(i).getHunger() + ", ");
        }
        System.out.println();
        farm.slaughter();
        for (int i = 0; i < farm.animals.size(); i++) {
            System.out.print(farm.animals.get(i).getHunger() + ", ");
        }
        System.out.println();
        farm.slaughter();
        for (int i = 0; i < farm.animals.size(); i++) {
            System.out.print(farm.animals.get(i).getHunger() + ", ");
        }

    }
}
