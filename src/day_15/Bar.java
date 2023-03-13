package day_15;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {

        /**
         * Create String variable: answer. Also, int variable numberOfDrinks.
         * Using any loop you would like, please create a following program.
         * If customer answers yes for another drink, barman sever him a drink and numberOfDrinks is incrementing
         * If customer says no - print the number of drinks the customer had
         */
        Scanner scan = new Scanner(System.in);
        int numberOfDrinks = -1;
        String answer = "yes";


        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Would you like a drink?");
            answer = scan.nextLine();
            numberOfDrinks++;
        }
        System.out.println(numberOfDrinks);

    }
}
