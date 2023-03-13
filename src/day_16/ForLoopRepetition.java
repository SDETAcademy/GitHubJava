package day_16;


public class ForLoopRepetition {
    public static void main(String[] args) {

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