package coding_hours;

public class CodingHours {
    public static void main(String[] args) {
        int hoursDaily = 6;
        int weeksInSemester = 17;
        int workDays = 5;
        int hoursWeekly = 52;

        int codingHours = weeksInSemester * workDays * hoursDaily;

        System.out.println(codingHours);

        System.out.println((float) codingHours / (hoursWeekly * weeksInSemester) * 100 + "%");
    }
}
