package day_14;

public class DoWhileLoopTwo {
    public static void main(String[] args) {

     int num = 10;
     int numTwo = 20;

     while (num<=100)
     {
         System.out.println("Number is " + num);
         num+=10;
     }

     do{
         System.out.println("Practicing do while loop");
         numTwo+=20;
     }while(numTwo<=100);


/**
 * the only difference between while loop and do while loop is with do while loop - your condition
 * will be executed at lest once regardless of your boolean condition. With wile loop - if the condition is false
 * - it will no get executed at all;
 */


    }
}
