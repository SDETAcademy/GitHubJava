package day_21;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {

        /**
         * Given an int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13}, please reverse the array
         * (create a separate array with the reversed values)
         * Hint: you can use any extra variables, arrays etc
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13}; // length - 13

        //[13,12,11,10,9,8,7,6,5,4,3,2,1]

        int[] result = new int[arr.length]; //[0,0,0,0,0,0,0,0,...0]

        for (int j = 0, i = arr.length-1; i>=0; i--, j++){ // 12 - i
            result[i] = arr[j]; // arr.length = 13;
                                            //  arr.length- 1 = 12;
                                                // 12 - i(12) = 0
                                                // 12 - i(11) = 1
                                                // 12 - i(10) = 2
        }

        System.out.println(Arrays.toString(result));



    }
}
