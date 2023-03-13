package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfHasUpperCase {
    public static void main(String[] args) {

        /**
         * Given the arraylist of String, remove the element if it has at least 1 upper case
         * Example:
         * [Java, java, Python, python, jaVa]
         * [java, python]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "phyton", "java"));
        list.removeIf(n -> !n.equals(n.toLowerCase()));
        System.out.println(list);

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {
            if (each.equals(each.toUpperCase())) ;
            result.add(each);
        }
        System.out.println(result);
    }
}

