package day_47;

import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfEach {
    public static void main(String[] args) {

        /**
         * Given an String[], create a custom method that will accept String[] and return map
         * - we should print element and it's length
         * Example [Cat, Dog, Camel]
         * {Cat=3, Dog=3, Camel=5}
         */

        String[] strArr = {"Cat", "Dog", "Camel"};
        System.out.println(lengthOfElement(strArr));

    }
    public static Map<String, Integer> lengthOfElement(String[] arr){
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : arr) {
            map.put(each, each.length());
        }
        return map;
    }
}
