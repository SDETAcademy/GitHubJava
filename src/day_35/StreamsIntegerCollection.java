package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntegerCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,4,4,4,4,5));
        System.out.println(removeElementsInRange(list, 0, 3));
        System.out.println(removeElementsInRange(list,2));

        /**
         * Create a custom method, that will accept the arraylist<Integer> and will only return the elements frequency of which
         * is not 2
         */

    }
    public static List<Integer> removeElementsInRange(ArrayList<Integer> list, int moreThen, int lessThen){
        List<Integer> collect = list.stream()
                .filter(n -> Collections.frequency(list, n) > moreThen && Collections.frequency(list, n) <  lessThen)
                .collect(Collectors.toList());
      return collect;
    }

    public static List<Integer> removeElementsInRange(ArrayList<Integer> list, int noMore){
        List<Integer> collect = list.stream()
                .filter(n -> Collections.frequency(list, n) != noMore)
                .collect(Collectors.toList());
        return collect;
    }

}
