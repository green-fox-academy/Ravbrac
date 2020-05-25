package reverse;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int storeNumber;

        for (int i = 0; i < numbers.length / 2; i++) {
            storeNumber = numbers[i];
            numbers[i] = numbers [numbers.length -1 -i];
            numbers[numbers.length -1 -i] = storeNumber;
        }

        for (int i = 0; i <  numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
