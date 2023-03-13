package day_47;

import java.util.HashMap;
import java.util.Map;

public class RemoveAB {
    public static void main(String[] args) {
        /**
         * create a custom method to do the following:
         *         {a=aaa, b=aaa, c=a, d=aa} -> {c=a, d=aa}
         *         {a=aaa, b=aa, c=a, d=aa} -> {a=aaa, b=aa, c=a, d=aa}
         *         {a=aaa, c=a, d=aa} -> {a=aaa, c=a, d=aa}
         */
        Map<Character, String> myMap = new HashMap<>();
        myMap.put('a', "aaa");
        myMap.put('b', "aaa");
        myMap.put('c', "a");
        myMap.put('d', "aa");

        System.out.println(removeABMethod(myMap));
    }

    public static Map<Character, String> removeABMethod(Map<Character, String> map){
        if(map.containsKey('a') && map.containsKey('b') && map.get('a').equals(map.get('b'))){
         map.remove('a');
         map.remove('b');
        }
        return map;
    }
}
