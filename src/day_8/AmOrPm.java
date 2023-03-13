package day_8;

import java.util.Random;

public class AmOrPm {
    public static void main(String[] args) {

        /**
         * create a int variable that will use Random class, and set the upper limit for 2
         * Create a simple if statement:
         * if variable == 0 then it's AM
         * if variable == 1 then it's PM
         */


        Random random = new Random();
         int randomNumber = random.nextInt(2);

         if(randomNumber == 0){
             System.out.println("It is AM");
         }else {
             System.out.println("It is PM");
         }

    }
}
