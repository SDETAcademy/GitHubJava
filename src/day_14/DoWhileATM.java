package day_14;

import java.util.Scanner;

public class DoWhileATM {
    public static void main(String[] args) {

        /**
         * Given expectedPin = 1234, please create a program that will take an actualPin from user using scanner.
         * Use do while loop until the pin numbers match or the number of attempts is more than 3
         */

        Scanner scan = new Scanner(System.in);
        int actualPin;
        int expectedPin = 1234;
        int count = 0;

        do {
            System.out.println("Enter PIN");
            actualPin = scan.nextInt();
            if (actualPin == expectedPin) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Try again");
                count++;
            }
        }
        while((actualPin != expectedPin) && count < 3);
    }
}
