package day_47;

import java.util.HashMap;
import java.util.Map;

public class SetToNothing {
    public static void main(String[] args) {
        /**
         *          create a custom method
         *         {a=apple, b=plum, c=orange} -> {a= , b=apple, c=orange}
         *         {a=apple, c=orange} -> {a=apple, c = orange}
         *          if map has key "a" and map has key "b" -> assign value from a to b, and set the value for a to "";
         *         but if map does not have key "a" or key "b" do nothing.
         */

        Map<Character, String> myMap = new HashMap<>();
        myMap.put('a', "apple");
        myMap.put('b', "plum");
        myMap.put('c', "orange");
        setToNothingMethod(myMap);
        System.out.println(myMap);

    }
    public static Map<Character, String> setToNothingMethod(Map<Character, String> map){
        if(map.containsKey('a') && map.containsKey('b')){
            map.put('b', map.get('a'));
            map.put('a', "");
        }
        return map;
    }
}
