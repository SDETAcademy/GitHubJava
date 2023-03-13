package day_8;

import java.util.Random;

public class DayOfTheWeek {
    public static void main(String[] args) {

        /**
         * create a random int variable and String variable called dayOfTheWeek;
         * based on the number - determine the day of the week:
         * 0 - Monday
         * 1 - Tuesday
         *
         *......
         *
         * 6 - Sunday
         * print yours statement using concatenation. The day of the week is + dayOfTheWeek;
         */

        Random random = new Random();
        String dayOfTheWeek = "Any Day";
        int dayNumber = random.nextInt(7);
        if(dayNumber == 0){
            dayOfTheWeek = "Monday";
        }else if(dayNumber == 1){
            dayOfTheWeek = "Tuesday";
        }else if(dayNumber == 2){
            dayOfTheWeek = "Wednesday";
        }else if(dayNumber == 3){
            dayOfTheWeek = "Thursday";
        }else if(dayNumber == 4){
            dayOfTheWeek = "Friday";
        }else if(dayNumber == 5){
            dayOfTheWeek = "Saturday";
        }else if(dayNumber == 6){
            dayOfTheWeek = "Sunday";
        }
        System.out.println("Day of the week is: " + dayOfTheWeek);



    }
}
