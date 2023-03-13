package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaRepetition {
    public static void main(String[] args) {

        /**
         * Lambda Expression
         * 1. Lambda implements a Functional Interface
         * 2. Distinct operator for lambda ->
         * 3. Lambda only works with Collections, so we cannot use it on Array
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,0,4,5,6,468,7,9));
//1.
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer each : list) {
            resultList.add(each*3);
        }
        System.out.println(list);
        System.out.println(resultList);
//2.
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*3);
        }
        System.out.println(list);
//3.

        list.replaceAll(x->x*3);
        System.out.println(list);


    }
}
