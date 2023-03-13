package day_8;

import java.util.Random;

public class DayOfTheWeekSwitchStatement {
    public static void main(String[] args) {

        /**
         * Create a String variable called dayOfTheWeek and create a simple switch statement
         * PS> don't forget about default
         */


        Random random = new Random();
//        String dayOfTheWeek = "Any Day";
//        int dayNumber = random.nextInt(7);
//        if (dayNumber == 0) {
//            dayOfTheWeek = "Monday";
//        } else if (dayNumber == 1) {
//            dayOfTheWeek = "Tuesday";
//        } else if (dayNumber == 2) {
//            dayOfTheWeek = "Wednesday";
//        } else if (dayNumber == 3) {
//            dayOfTheWeek = "Thursday";
//        } else if (dayNumber == 4) {
//            dayOfTheWeek = "Friday";
//        } else if (dayNumber == 5) {
//            dayOfTheWeek = "Saturday";
//        } else if (dayNumber == 6) {
//            dayOfTheWeek = "Sunday";
//        }
//        System.out.println("Day of the week is: " + dayOfTheWeek);

        int dayNumber = 0;
        switch (dayNumber) {
            case 0:
                if (dayNumber ==0){
                System.out.print("Monday");}
            case 1:
                System.out.print("Tuesday");
                break;
            case 2:
                System.out.print("Wednesday");
            case 3:
                System.out.print("Thursday");
                break;
            case 4:
                System.out.print("Friday");
                break;
            case 5:
                System.out.print("Saturday");
                break;
            case 6:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Wrong input");
        }


        boolean isRaining = true;

        System.out.println(!isRaining);



    }
}
