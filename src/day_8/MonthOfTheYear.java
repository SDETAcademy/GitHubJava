package day_8;

import java.util.Random;

public class MonthOfTheYear {
    public static void main(String[] args) {

        /**
         * create a random int variable and String variable called nameOfTheMonth;
         * if random int variable = 0 - nameOfTheMonth = January
         * if random int variable = 1 - nameOfTheMonth = February
         * .........
         *  .           .............. - December
         */


        Random random = new Random();
        int number = random.nextInt(12);
        String monthOfTheYear = "none";

        if (number == 0) {
            monthOfTheYear = "January";
        } else if (number == 1) {
            monthOfTheYear = "February";
        } else if (number == 2) {
            monthOfTheYear = "March";
        } else if (number == 3) {
            monthOfTheYear = "April";
        } else if (number == 4) {
            monthOfTheYear = "May";
        } else if (number == 5) {
            monthOfTheYear = "Jun";
        } else if (number == 6) {
            monthOfTheYear = "July";
        } else if (number == 7) {
            monthOfTheYear = "August";
        } else if (number == 8) {
            monthOfTheYear = "September";
        } else if (number == 9) {
            monthOfTheYear = "October";
        } else if (number == 10) {
            monthOfTheYear = "November";
        } else if (number == 11) {
            monthOfTheYear = "December";
        }
        System.out.println("The day of the week is: " + monthOfTheYear);

        /**
         * if Months is December, January or February - print it's "Winter"
         * if March April May - print "It's Spring"
         *
         * .......
         *
         * ..................... - print "It's Fall"
         */

        if (monthOfTheYear.equals("December") || monthOfTheYear.equals("January") || monthOfTheYear.equals("Ferruary")) {
            System.out.println("It is Winter");
        } else if ((monthOfTheYear.equals("March") || monthOfTheYear.equals("April") || monthOfTheYear.equals("May"))) {
            System.out.println("It is Spring");
        } else if ((monthOfTheYear.equals("June") || monthOfTheYear.equals("July") || monthOfTheYear.equals("August"))) {
            System.out.println("It is Summer");
        }else{
            System.out.println("It is Fall");
        }





    }
}
