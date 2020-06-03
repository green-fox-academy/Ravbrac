package doable_homework;

import java.util.HashMap;

public class DoableHomework {
    public static void main(String[] args) {
        HashMap<String, String> tree1 = new HashMap<>();
        HashMap<String, String> tree2 = new HashMap<>();
        HashMap<String, String> tree3 = new HashMap<>();
        HashMap<String, String> tree4 = new HashMap<>();
        HashMap<String, String> tree5 = new HashMap<>();

        tree1.put("type", "Apple tree");
        tree1.put("leaf color", "Green");
        tree1.put("age", "5");
        tree1.put("sex", "Male");

        tree2.put("type", "Peach Tree");
        tree2.put("leaf color", "Green");
        tree2.put("age", "8");
        tree2.put("sex", "Male");

        tree3.put("type", "Weirwood");
        tree3.put("leaf color", "Red");
        tree3.put("age", "520");
        tree3.put("sex", "Female");

        tree4.put("type", "Apple Tree");
        tree4.put("leaf color", "Green");
        tree4.put("age", "9");
        tree4.put("sex", "Female");

        tree5.put("type", "Gold Tree");
        tree5.put("leaf color", "Yellow");
        tree5.put("age", "43");
        tree5.put("sex", "Male");

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
        System.out.println(tree5);

    }
}
