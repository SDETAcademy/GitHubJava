package day_47;

import java.util.LinkedHashMap;
import java.util.Map;

public class PopulateTheMap {
    public static void main(String[] args) {

        /**
         * String[] arr = [Lion, Tiger, Cat, Dragon, Zebra]
         * {L=Lion, T=Tiger, C=Cat, D=Dragon, Z=Zebra}
         */

        String[] strArr = {"Lion", "Tiger", "Cat", "Dragon", "Zebra"};
        System.out.println(populateTheMapMethod(strArr));
    }
    public static Map<Character, String> populateTheMapMethod(String[] strArr){
        Map<Character, String> myMap = new LinkedHashMap<>();
        for (String each : strArr) {
            myMap.put(each.charAt(0), each);
        }
        return myMap;
    }
}
