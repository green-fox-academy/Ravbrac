package reverse;


import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String parameter){
        String reversed= "";

        for (int i = parameter.length() - 1; i >= 0; i--) {
            reversed += parameter.charAt(i);
        }
        return reversed;
    }
//    public static String reverse(String parameter) {
//        String[] splitParameter = parameter.split("");
//        String storage;
//        for (int i = 0; i < splitParameter.length / 2; i++) {
//            storage = splitParameter[i];
//            splitParameter[i] = splitParameter[splitParameter.length - 1 - i];
//            splitParameter[splitParameter.length - 1 - i] = storage;
//        }
//
//        parameter = Arrays.toString(splitParameter);
//        return parameter;


}
