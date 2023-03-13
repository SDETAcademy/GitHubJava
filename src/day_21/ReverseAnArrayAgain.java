package day_21;

import java.util.Arrays;

public class ReverseAnArrayAgain {
    public static void main(String[] args) {


        /**
         * int[] a - [1,2,3,4,5] - length - 5; index of the last element - array.length-1
         * int[] b - [5,4,3,2,1] - length is always going to be the same - 5;  index of the last element - array.length-1
         *

         */


        int[] a = {1,2,3,4,5,6, 1,2 ,1 ,2 ,1, 65, 16,51 ,1 ,98, 19, 19,81, 9, 1,98}; // length -5, last index is length-1 = 5-1 = 4
        int[] b = new int[a.length]; // 5 - because the length of out array is 5
        //        [5,0,0,0,0,0]
        b[0] = a[4];
        b[1] = a[3];
        b[2] = a[2];
        b[3] = a[1];
        b[4] = a[0];

        for (int i = 0, j = a.length-1; i<a.length; i++, j--){
            b[i] = a[j];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));





    }
}
