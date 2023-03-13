package day_47;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {
    public static void main(String[] args) {

        /**
         * Given an String[] arr please create a custom method that will return a map, and will have element of our String[]
         * as a key, and boolean for the value, if the element has duplicate or not
         * String[] strArr = {"a", "a", "a", "b", "c", "d", "d", "r"};
         *a=true, b=false, c=false, d=true, r=false
         */
        String[] strArr = {"a", "a", "a", "b", "c", "d", "d", "r"};
        System.out.println(containsKeyCustomMethod(strArr));

    }
    public static Map<String, Boolean> containsKeyCustomMethod(String[] strArr){
        Map<String, Boolean> map = new HashMap<>();
        for (String each : strArr) {
            map.put(each, map.containsKey(each));
        }
        return map;
    }
}
