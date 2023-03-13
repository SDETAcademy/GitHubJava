package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNegativeFromArray {
    public static void main(String[] args) {

        /**
         * Given an array of int create a custom method:
         * 1. remove all elements <0
         * 2. sort an array
         * Example:
         * [1,3,1,-2,94,3,-10,4,531,-71]
         * [1,1,3,3,4,94,531]
         * 30095417 - Cornelia
         * 514333 - Nick
         * 35422791 - Tatiana
         */
        int[] num = {1,3,1,-2,94,3,-10,4,531,-71};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(myMethod(num)));
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
    public static int[] myMethod(int[] num){
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : num) {
            list.add(each);
        }
        list.removeIf(n->n<0);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
