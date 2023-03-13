package day_13;

import java.util.Random;

public class WhileLoopWithCount {
    public static void main(String[] args) {


        /**
         * Create a count variable;
         * create the int variable for num, using random class(20).
         * if num is even - print "Number is even"
         * if num is odd - print "Number is odd"
         * if num is 0 - print "Number is 0"
         * do not forget to change your while condition so you don't get an endless loop
         */

        Random random = new Random();
        int count = 0;

        while (count < 20) {
            count++;
            int num = random.nextInt(20);
            if (num == 0) {
                System.out.println("Number is 0");
            } else if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }


        }
    }

}
