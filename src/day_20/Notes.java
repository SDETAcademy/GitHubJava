package day_20;

import java.util.Arrays;

public class Notes {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7};
        int[] arrTwo = {5,1};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrTwo));

        arrTwo = arr;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrTwo));



    }
}
