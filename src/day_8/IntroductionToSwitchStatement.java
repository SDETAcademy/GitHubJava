package day_8;

import java.util.Random;

public class IntroductionToSwitchStatement {
    public static void main(String[] args) {

        String months = "january";

        switch (months){
            case "January":
                System.out.println("January is the 1st months of the year");
            case "February":
                System.out.println("February is the 2nd months of the year");
            case "March":
                System.out.println("March is the 3d months of the year");
            case "April":
                System.out.println("April is the 4th months of the year");
            case "May":
                System.out.println("May is the 5th months of the year");
                break;
            case "June":
                System.out.println("June is the 6th months of the year");
                break;
            case "July":
                System.out.println("July is the 7th months of the year");
                break;
            case "August":
                System.out.println("August is the 8th months of the year");
                break;
            case "September":
                System.out.println("September is the 9th months of the year");
                break;
            case "October":
                System.out.println("October is the 10th months of the year");
                break;
            case "November":
                System.out.println("November is the 11th months of the year");
                break;
            case "December":
                System.out.println("December is the 12th months of the year");
                break;
            default:
                System.out.println("Wrong input");
        }

        Random random = new Random();
        int numberTwo = random.nextInt(10);
        System.out.println(numberTwo);
        switch (numberTwo){
            case 1:
                System.out.println("Number is 1");
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Wrong Input");
        }



    }
}
