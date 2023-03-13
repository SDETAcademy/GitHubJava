package day_20;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        /**
         * Create an array that will contain names of all students in out class;
         * Print the array elements with girls only
         */

        String[] arr = new String[6];
        arr[0] = "Maria";
        arr[1] = "Tatsiana";
        arr[3] = "Mu";
        arr[4] = "Julian";
        arr[2] = "Roman";
        arr[5] = "Cornelia";

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        for (int i = 0; i<arr.length; i++){

            if(i==0 || i==1 || i==5){
                System.out.println(arr[i]);
            }
        }

        char[] arrChar = new char[3];
        System.out.println(Arrays.toString(arrChar));

    }
}
