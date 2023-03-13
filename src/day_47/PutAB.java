package day_47;

import java.util.HashMap;
import java.util.Map;

public class PutAB {
    public static void main(String[] args) {

        /**
         * Create a custom method
         * {a=apple, b=carrot, c=beet, d=tomato}
         * if map has key 'a' and key 'b', then:
         * {ab=applecattot, c=beet, d=tomato}
         * else - return the same map
         */

        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "apple");
        myMap.put("b", "carrot");
        myMap.put("c", "beet");
        myMap.put("d", "tomato");
        System.out.println(putTogetherMethod(myMap));

    }
    public static Map<String, String> putTogetherMethod(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a") + map.get("b"));
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
