package day_3;

import java.util.Scanner;

public class CalculateAreOfTheSquare {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        /**
         * create a program that will accept input from the user, and will calculate the area of the square
         * formula for the area of the square - a*a, where a is being your size of the side;
         */

        int a;
        System.out.println("Please enter your value");
        a = in.nextInt();
        int formula = a*a;
        System.out.println("the result is: " + formula);




    }
}
