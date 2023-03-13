package day_20;


import java.util.Arrays;
import java.util.Random;

public class ArrayPracticeRandomArray {
    public static void main(String[] args) {

        /**
         * Create a program, that will  create an array with the (randomly) length (maximum length of 50)
         * and assign random values to every element of the array
         */

        Random random = new Random();
        int randomLength = random.nextInt(51);
        int[] arr = new int[randomLength];

        for (int i = 0; i< arr.length; i++){
            int randomValue = random.nextInt(201);
            arr[i] = randomValue;
        }

        System.out.println(Arrays.toString(arr));
    }
}
