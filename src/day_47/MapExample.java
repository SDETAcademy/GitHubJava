package day_47;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        System.out.println(myMap.isEmpty());

        myMap.put(1, "Tatsiana");
        System.out.println(myMap.isEmpty());
        System.out.println(myMap);

        myMap.put(-1, "Tatsiana");
        myMap.put(1, "Maria");
        myMap.put(3, "Cornelia");
        System.out.println(myMap);

        for (Map.Entry<Integer, String> each : myMap.entrySet()) {
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }

        for (String each : myMap.values()) {
            System.out.println(each);
        }

        for (Integer each : myMap.keySet()) {
            System.out.println(each);
        }

    }
}
