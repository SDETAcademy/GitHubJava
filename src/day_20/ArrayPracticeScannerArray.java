package day_20;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeScannerArray {
    public static void main(String[] args) {


        /**
         * Create a program that will accept length of the array from the user as well as
         * values for each of the elements in the array
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int lengthOfArray = in.nextInt(); // 10
        int[] arr = new int[lengthOfArray]; // 10

        for (int i = 0; i<arr.length; i++){
            System.out.println("Please enter the value for your " + i + " element");
            int userValue = in.nextInt();
            arr[i] = userValue;
            System.out.println("You have " + (arr.length-1-i) + " more values to input");
        }

        System.out.println(Arrays.toString(arr));






    }
}
