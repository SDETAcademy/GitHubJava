package day_35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRecap {
    public static void main(String[] args) {

        /**
         * 1. The closest thing that looks like streams is loop
         * 2. Functional programming was adopted in Java at version 8
         * 3. Streams are implementing Functional Interface(Programming)
         * 4. The most powerful(commonly used) methods:
         * - map() - when changing elements value
         * - filter() - when we need to keep the elements that are true to our condition
         * - distinct() - will return only unique elements
         * 5. Other methods: min, max, average.....
         * 6. Streams can work with both, arrays and collections
         */

        int[] numArr = {1,23,546,45,9};
        int[] toArray = Arrays.stream(numArr).map(n -> n * 3).toArray();
        System.out.println(Arrays.toString(toArray));

        int[] ints = Arrays.stream(new int[]{2, 3, 46, 4, 98}).filter(x -> x > 10).toArray();
        System.out.println(Arrays.toString(ints));

        String[] strArr = {"Java", " is", " fun"};
        List<String> collect = Arrays.stream(strArr).map(s -> s.toUpperCase()
                .replace(" ", "*")).collect(Collectors.toList());
        System.out.println(collect);


    }
}
