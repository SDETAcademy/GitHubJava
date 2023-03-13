package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementEvenOrOdd {
    public static void main(String[] args) {

        /**
         * [cat, car, dog, lime, parrot] - check each element and if the length is even - print true, else false
         * [false, false, false, true, true].
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "car", "dog", "lime", "parrot"));
        list.replaceAll(n-> String.valueOf(n.length()%2==0));// we are wrapping to convert boolean into String again
        System.out.println(list);

    }
}
