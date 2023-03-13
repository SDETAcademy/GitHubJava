package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class MathList {
    public static void main(String[] args) {

        /**
         * If the sum of element square(element*element) is not even - remove it from the list
         * 3*3 = 9%2!=0 - remove
         * 2*2 = 4%2 = 0 - keep the element
         *
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,21,31,34,654,64,4,687,64,3,8794,513,67));
        list.removeIf(n -> (n*n)  % 2 != 0);
        System.out.println(list);


    }
}
