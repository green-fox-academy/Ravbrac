package append_a_2;

public class AppendA2 {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end

        String[] animals = {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + "a");
        }
    }
}
