package day_12;

import java.util.Scanner;

public class EmailPractice {
    public static void main(String[] args) {

        /**
         * Swap first name with last name in the email (Seperated by an underscore).
         * If the email doesn't contain an underscore print the given input email.
         * please make sure str is not blank or empty.
         *
         * Examples:
         *
         *
         * ***
         * input: mike_tyson@gmail.com
         *
         * output: tyson_mike@gmail.com
         * ***
         *
         * ***
         * input: barakobama@gmail.com
         *
         * output: barakobama@gmail.com
         * ***
         */
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = "";


        if(str.isEmpty() || str.isBlank() || str.length()==0 ){
            System.out.println("Str is empty or blank");
        }else if(!str.contains("_")){
            System.out.println(str);
        } else if (!str.contains("@")) {
            System.out.println("Invalid Email");
        } else{
            int atCharacter = str.indexOf("@");
            String domain = str.substring(atCharacter);
            int underScoreCharacter = str.indexOf("_"); // -1
            String firstName = str.substring(0, underScoreCharacter);
            String lastName = str.substring(underScoreCharacter+1, atCharacter);
            result = lastName + "_" + firstName + domain;
            System.out.println(result);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the money to give: ");
        int money = scan.nextInt();
        while (money != 5) {
            money = scan.nextInt();
            if(money != 5 ) {System.out.println("It's not a $5! Gif 5 please!");}
        }
        System.out.println("thanks for $5.");




    }
}
