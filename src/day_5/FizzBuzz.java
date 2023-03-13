package day_5;

public class FizzBuzz {
    public static void main(String[] args){

        /**
         * If number is devisable by 3 and 5 - print FizzBuzz
         * if the number is devisible by 3 but not 5 - print Fizz
         * if the number is not devisible by 3 but devisible by 5 - print Buzz
         *
         */

        int a = 9;

        if (a == 0){
            System.out.println("Your input is 0, please consider changing it");
        }else if(a%3 == 0 && a%5 == 0){
            System.out.println("FizzBuzz");
        }else if(a%3 == 0 && a%5 != 0){
            System.out.println("Fizz");
        }else if(a%3 != 0 && a % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println("invalid input, the program will shut down");
        }


    }
}
