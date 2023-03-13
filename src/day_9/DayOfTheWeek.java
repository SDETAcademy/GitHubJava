package day_9;

import java.util.Random;

public class DayOfTheWeek {

    public static void main(String[] args) {

/**
 Create a program, that will determine if the employee is working today or not. Create a random day of the week picker,
 boolean variables isHoliday, isWeekday. If true - "Go to Work", if false - "Stay Home". Use ternary statement.
 */
        Random random = new Random();
        String dayOfTheWeek;
        boolean isHoliday;


        int dayPicker = random.nextInt(7);
        if(dayPicker == 0){
            dayOfTheWeek = "Monday";
        } else if (dayPicker == 1) {
            dayOfTheWeek = "Tuesday";
        } else if (dayPicker == 2) {
            dayOfTheWeek = "Wednesday";
        } else if (dayPicker == 3) {
            dayOfTheWeek = "Thursday";
        } else if (dayPicker == 4) {
            dayOfTheWeek = "Friday";
        } else if (dayPicker == 5) {
            dayOfTheWeek = "Saturday";
        }else{
            dayOfTheWeek = "Sunday";
        }
        System.out.println(dayOfTheWeek);

        int holidayPicker = random.nextInt(2);
        if(holidayPicker == 0){
            isHoliday = true;
        }else{
            isHoliday = false;
        }
        System.out.println(isHoliday);

        if(isHoliday == true){
            System.out.println("It is a holiday");
        }else {
            if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                System.out.println("It is a weekend");
            } else {
                System.out.println("It is a work day");
            }
        }
    }

}
