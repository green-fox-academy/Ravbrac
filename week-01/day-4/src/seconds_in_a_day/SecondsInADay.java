package seconds_in_a_day;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int dailySeconds = 24 * 60 * 60;

        System.out.println(dailySeconds - ((currentHours * 3600) + (currentMinutes * 60) + currentSeconds));
    }
}
