package sum_all;

public class SumAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers+= numbers[i];
        }
        System.out.println(sumNumbers);

    }
}
