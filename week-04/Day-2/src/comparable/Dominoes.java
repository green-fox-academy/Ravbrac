package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        
        Arrays.sort(dominoes);
        System.out.println(Arrays.asList(dominoes));

        List<Domino> snakeDominoes = new ArrayList<>();
        Random random = new Random();
        snakeDominoes.add(dominoes.get(random.nextInt(5)));

        for (int i = 0; i < dominoes.size(); i++) {

            for (int j = 0; j < dominoes.size(); j++) {

                if ((snakeDominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide()) && (snakeDominoes.size() <
                        dominoes.size())){
                    snakeDominoes.add(dominoes.get(j));
                }

            }

        }

        System.out.println(snakeDominoes);


    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}

