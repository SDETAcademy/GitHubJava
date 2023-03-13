package day_4;

import java.util.Scanner;

public class ConcatenationPractice {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        /**
         * 1. Create a single print statement, that will look like:
         * home address
         * 2. Create a program, that will ask user for the country code, area code, and the 7-digit number;
         */

//
//        byte countryCode = 1;
//        short areaCode = 929;
//        int phoneNumber = 1234567;
//        String myPhoneNumber = "My Phone number is:\n" + "+" + (long)countryCode + "-" + (long)areaCode + "-" + (long)phoneNumber;
//        System.out.println(myPhoneNumber);


        /**
         * Create a scanner object so you can accept values from the user
         * Ask for the care make and model, ask for MPG, ask how far is he is going to travel.
         * print out the result as a String statement using concetanation(avoid using variables)
         */


//        String carMakeAndModel;
//        double MPG;
//        long distance;
//        System.out.println("Please enter your care make and model");
//        carMakeAndModel = in.nextLine();
//        System.out.println("Please enter the MPG for your vehicle");
//        MPG = in.nextDouble();
//        System.out.println("Please enter the distance you plan to travel");
//        distance = in.nextLong();
//        System.out.println("You will need " + (distance/MPG) + " gallons of gas, if you are driving " + carMakeAndModel);

        /**
         * Create a program that will accept the input from the User using Scanner, to collect the following information:
         * Name, Position, Hourly Rate, Saving %(annual salary), Target amount of money to retire with
         * Print the statement and use concatenation as much as possible.
         *
         */

        String name;
        String position;
        double payPerHour;
        double savingPercentage;
        byte age;
        double targetAmount;
        System.out.println("Please enter your name");
        name = in.nextLine();
        System.out.println("Please enter the position");
        position = in.next();
        System.out.println("What is your hourly pay rate?");
        payPerHour = in.nextDouble();
        System.out.println("Enter your age");
        age = in.nextByte();
        System.out.println("How much are you saving each year?");
        savingPercentage = in.nextDouble();
        System.out.println("Enter your target amount of money you want to retire with");
        targetAmount = in.nextDouble();
        System.out.println("Hello Dear " + name + "\n" +" you work as a " + position +  "\nyour annual salary is $" +
                (payPerHour*40*52) + ", that being said, with the saving rate of %" +
                savingPercentage +"\n" + " , that means you are saving "  + (payPerHour*40*52)/100*savingPercentage +
                " per year, and it will take you " + "\n" + targetAmount/((payPerHour*40*52)/100*savingPercentage) +
                "years to retire"
         + " you will retire at the age of " + (age + (targetAmount/((payPerHour*40*52)/100*savingPercentage))));


        //100,000/5200















    }
}
