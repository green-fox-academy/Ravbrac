package takes_longer;


public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);

        int index = quote.indexOf("you");
        StringBuilder fixedQuote = new StringBuilder();
        String addition = "always takes longer than ";

        for (int i = 0; i < quote.length(); i++) {
            fixedQuote.append(quote.charAt(i));
            if (i == index - 1) {
                fixedQuote.append(addition);
            }
        }
        System.out.println(fixedQuote);


    }
}
