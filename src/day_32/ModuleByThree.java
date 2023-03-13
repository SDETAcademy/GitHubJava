package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class ModuleByThree {
    public static void main(String[] args) {

        /**
         * [10,20,15,3] %3
         * [1,2,0,0]
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,15,3));
        int num = 3;
        list.replaceAll(n -> n % num);
        System.out.println(list);


    }
}
