package day_17;

import java.util.Random;

public class BreakAndContinuePractice {
    public static void main(String[] args) {

        /**
         * Create a program that will print only the even numbers and ignore the odd numbers.
         * If the number is 0 - break out of the loop
         */
        Random random = new Random();


        for (int i = 0; i<10; i++){
            int number = random.nextInt(20);

            if(number==0){
                break;
            }else if(number%2==1){
                continue;
            }else{
                System.out.println(number);
            }

        }



    }
}
