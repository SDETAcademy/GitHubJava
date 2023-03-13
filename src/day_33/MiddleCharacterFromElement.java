package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleCharacterFromElement {
    public static void main(String[] args) {
        /**
         * 1. Given a list of strings, return a list with middle character of each element
         * [Java, JavaScript, Kotlin, C++]
         * [v, c, l, +]
         * 2. double the character
         * [v, c, l, +]
         * [vv, cc, ll, ++]
         */

//        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Kotlin", "Pascal"));
//        ArrayList<String> result = new ArrayList<>();
//        for (String each : list) {
//            result.add("" + each.charAt(each.length()/2)+ each.charAt(each.length()/2));
//        }
//        System.out.println(result);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","javaScript","Kotlin","C++"));
        list.replaceAll(n -> ("" + n.charAt(n.length()/2)).repeat(2));
        System.out.println(list);

    }
}
