package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyByTwo {
    public static void main(String[] args) {
        /**
         * Assume we have an arraylist of integers [1,2,3,4,5,6].
         * Create a custom method that will multiply each element by 2
         * Result [2,4,6,8,10,12]
         * [2, 4, 62, 10, 8, 1296, 92, 26, 42, 136, 16]
         */

        ArrayList<Integer> myList= new ArrayList<>(Arrays.asList(1,2,31,5,4,648,46,13,21,68,8));

        myList.replaceAll(n -> n*2);
        System.out.println(myList);

//        ArrayList<Integer> result = new ArrayList<>();
//        for(Integer each :myList){
//            result.add(each*2);
//        }
//        System.out.println(result);

    }

}
