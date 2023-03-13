package day_25;

import java.util.Scanner;

public class MethodIntroductionCornelia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, please enter the number of iterations");
        int numberOfIterations = in.nextInt();
        String helloWorld = "Hello";
        System.out.println("Please enter your name");
        String name = in.next();
        printHelloWorld(helloWorld, name, numberOfIterations);


    }



    public static void printHelloWorld(String strOne, String strTwo, int numberOfIterations){
        for (int i = 0; i < numberOfIterations; i++) {
            System.out.println(strOne + " " + strTwo);
        }
    }
}
