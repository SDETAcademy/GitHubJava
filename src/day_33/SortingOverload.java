package day_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingOverload {
    public static void main(String[] args) {

        /**
         * Create a custom method, that will be overloaded.
         * The method can accept either ArrayList<Integer> or int[]
         * Method should sort hte argument.
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 654, 98, 43, 4));
        int[] num = {2, 31, 654, 64, 84, 9, 78, 465, 1};

        long startTime = System.nanoTime();
        sorting(list);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    public static int[] sorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static ArrayList<Integer> sorting(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
