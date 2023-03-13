package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethodsIntroduction {
    public static void main(String[] args) {
        /**
         * ArrayList - is part of collections in Java
         * There are plenty of ready to use advanced methods coming out of Collections class(java.util package)
         *
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,7,3,78,9,5,7,9,0,2,4,54,6));
        System.out.println(list);
        Collections.reverse(list); // will change the original arraylist
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.replaceAll(list, 6, -6));
        System.out.println(list);
        Collections.swap(list, 3, list.size()-1);
        System.out.println(list);
        System.out.println(Collections.frequency(list, -6));


    }
}
