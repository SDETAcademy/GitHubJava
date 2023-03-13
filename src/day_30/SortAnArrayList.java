package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArrayList {
    public static void main(String[] args) {

        /**
         * [1,3,4,5,6,1,2,6]
         * 1. Needed to use swapping depending if it's ascending or descending order
         */

        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(1,4,2,5,52,5,432,432,432,434,5,65463,2));

        //arr[i] = arr[j]
        // a = b;
        // list.set(i, list.get(j))

        int temp;
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = 0; j < listInt.size(); j++) {
                System.out.println(listInt.get(i));
                System.out.println(listInt.get(j));
                System.out.println(listInt);
                if(listInt.get(i)<listInt.get(j)){
                    //      a               b
                    temp = listInt.get(i);
                    listInt.set(i,listInt.get(j));
                    listInt.set(j, temp);
                }
            }
        }

        System.out.println(listInt);







    }
}
