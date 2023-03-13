package day_8;

public class OddOrEvenNumber {
    public static void main(String[] args){

        /**
         * Please create 1 int variable named number and verify if the number is odd or even. Use Ternary for this task
         */

        int number = 6;
        String result;

        result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
