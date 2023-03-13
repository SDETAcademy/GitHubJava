package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class SquareElement {
    public static void main(String[] args) {

        /**
         * Given a list of integers, return a list where each integer is multiplied with itself.
         * square([1, 2, 3]) → [1, 4, 9]
         * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,23,1,6,4));
        list.replaceAll(n->n*n);
        System.out.println(list);

        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer each : list) {
            myList.add(each*each);
        }
        System.out.println(myList);

    }
}
