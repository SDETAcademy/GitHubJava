package day_9;

public class DayOfTheWeekStringManipulation {
    public static void main(String[] args){

        /**
         * Create a string variable called Weekdays with the following value:
         * "Monday Tuesday Wednesday Thursday Friday"
         * if your weekDays includes your day name - print "It's weekday" otherwise - "It's weekend"
         *
         */

        String weekDays = "Monday Thursday Wednesday Thursday Friday";
        String day= "Monday";


        if(weekDays.contains(day)) {
            System.out.println("It is weekday");
        }else{
            System.out.println("It is weekend");


        }


    }
}
