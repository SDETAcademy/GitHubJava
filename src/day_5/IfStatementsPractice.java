package day_5;

import java.util.Scanner;

public class IfStatementsPractice {
    public static void main(String[] args){

//        if(a == 10){
//            System.out.println("a is 10");
//        }else if(a ==20){
//            System.out.println("a is 20");
//        }else if(a==99){
//            System.out.println("a == 99");
//        }else if(a==31){
//            System.out.println("a == 31");
//        }
//
//        int a=99;
//
//        int b = 33;
//
//
//        if(a==b){
//            System.out.println("a == b");
//        }if(a<b){
//            System.out.println("a < b");
//        }if(a ==0){
//            System.out.println("a == 0");
//        }if(a != b){
//            System.out.println("a != b");
//        }if(a > b){
//            System.out.println("a > b");
//        }else{
//            System.out.println("a is something else, please leave me alone ;(");
//        }


        /**
         * Amazon cart - lets create a program, that will accept an input form the user Using Scanner
         * accept 2 items - 2x String names
         * accept 2 price - 2x price
         * boolean variable isPrime; If account isPrime = true - give a 10% discount; else - no discount
         * calculate the total and print statement;
         */

        Scanner in = new Scanner(System.in);

        String itemOne;
        String itemTwo;
        double priceOne;
        double priceTwo;
        boolean isPrime;
        double tax = 8.9;
        System.out.println("Hello and welcome to Amazon");
        System.out.println("Please enter the name for item one");
        itemOne = in.next();
        System.out.println("Please enter the name for item two");
        itemTwo = in.next();
        System.out.println("Please enter the price for item one");
        priceOne = in.nextDouble();
        System.out.println("Please enter the price for item two");
        priceTwo = in.nextDouble();
        System.out.println("Is your account PRIME?");
        isPrime = in.nextBoolean();
        tax = (priceOne+priceTwo)/100*tax;
        double total = priceOne + priceTwo + tax;
        if(isPrime==true){
            total = total*0.9;
        }

        System.out.println("Your item one is " + itemOne + " with the price of $" + priceOne);
        System.out.println("Your item two is " + itemTwo + " with the price of $" + priceTwo);
        System.out.println("Your total is " + total);

    }
}
