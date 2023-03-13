package day_4;

import java.util.Scanner;

public class ScannerRepetition {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        /**
         * Create the program that will ask you for your origin of travel, destination, round trip or one way(boolean),
         * name, number of passenger, the program should calculate your fare price.
         */
//
//        String origin;
//        String destination;
//        boolean roundTrip;
//        String name;
//        System.out.println("******************************");
//        System.out.println("******Welcome To Expedia******");
//        System.out.println("******************************");
//        System.out.println("Please Enter your origin");
//        origin = in.next();
//        System.out.println("Please Enter your destination");
//        destination = in.next();
//        System.out.println("Is this a round trip?");
//        roundTrip = in.nextBoolean();
//        System.out.println("Please enter your name");
//        name = in.next();
//        System.out.println("How many tickets you need to purchase?");
//        int numberOfPassengers = in.nextInt();
//        int ticketPrice = 700;
//        double tax = 10;
//        double grandTotal = (numberOfPassengers*ticketPrice)*0.90;
//        System.out.println("Your total is: " + grandTotal);

        int a = 10;
        boolean flag = false;

        if (a<5){
     flag = true;

        }else{
    flag = false;
        }

        System.out.println(flag);





    }
}
