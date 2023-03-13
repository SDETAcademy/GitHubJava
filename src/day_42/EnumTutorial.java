package day_42;

import java.util.Arrays;

public class EnumTutorial {
    public static void main(String[] args) {

        DaysOfTheWeek friday = DaysOfTheWeek.FRIDAY;
        System.out.println(friday.equals("FRIDAY"));
        System.out.println(friday.toString().equals("FRIDAY"));
        System.out.println(friday);

        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        for (DaysOfTheWeek each : days) {
            System.out.println(each);
        }
        System.out.println(Arrays.toString(days));
    }
}
