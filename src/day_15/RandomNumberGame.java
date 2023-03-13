package day_15;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {

        /**
         * Create a game, that will have 2 int variables(secretNumber and actualNumber);BONUS: int variable numberOfAttempts;
         * Use random class with upper bound limit set to 10;
         * Use any loop you would like, and we should iterate until the secretNumber match the actual number.
         * if(actualNumber> secretNumber) - print the number is too big
         * if(actualNumber< secretNumber) - print the number is too small
         * if(actualNumber = secretNumber) - the numbers match
         * BONUS: please how many attempts it took for numbers to match
         */
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int secretNumber;
        int actualNumber;
        int numberOfAttempts=0;
        secretNumber = in.nextInt(); // 10

        do {
            numberOfAttempts++;
            actualNumber = random.nextInt(10);//0,1,2,3,4,5,6,7,8,9
            if (actualNumber > secretNumber) {
                System.out.println("number is too big");
            }else if (actualNumber < secretNumber){
                System.out.println("number is too small");
            }else{
                System.out.println("number is match");
            }

        }while (secretNumber!=actualNumber);
        System.out.println("it have " + numberOfAttempts + " times");






    }
}
