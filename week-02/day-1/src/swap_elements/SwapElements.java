package swap_elements;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] order = {"first", "second", "third"};

        String store0 = order[0];
        order[0] = order[2];
        order[2] = store0;

        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i]);
        }
    }
}
