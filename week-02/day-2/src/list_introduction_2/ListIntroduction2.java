package list_introduction_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //        Create a list ('List A') which contains the following values
        //                Apple, Avocado, Blueberries, Durian, Lychee
        //        Create a new list ('List B') with the values of List A
        //        Print out whether List A contains Durian or not
        //        Remove Durian from List B
        //        Add Kiwifruit to List A after the 4th element
        //        Compare the size of List A and List B
        //        Get the index of Avocado from List A
        //        Get the index of Durian from List B
        //        Add Passion Fruit and Pomelo to List B in a single statement
        //        Print out the 3rd element from List A

        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println(ListA.contains("Durian"));
        ListB.remove("Durian");
        ListA.add(4, "Kiwifruit");
        String sizeLists = (ListA.size() > ListB.size()) || (ListA.size() < ListB.size()) ? "The size of the Lists are not equal" : "The size of the lists are equal";
        System.out.println(sizeLists);
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        ListB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(ListA.get(2));
    }
}
