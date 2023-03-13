package day_47;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.size());
        map.put(1, "Apple");
        map.put(2, "Apple");
        map.put(3, "Pineapple");
        map.put(4, "Plum");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(0));
//        map.clear();
//        System.out.println(map);
//        map.remove(4);// - removes a key at the specified index, regardless of the value
//        System.out.println(map);
        map.remove(4, "Plum");//- will not remove a key if the value doesn't match
        System.out.println(map);

        map.remove(-5); // if the index is not found, nothing will happen
        System.out.println(map);

        map.replace(3, "Pear");// if the index is found, the new value will be assigned
        System.out.println(map);

        map.replace(10, "Pear");// if the index is not found, there will be no changes
        System.out.println(map);

        map.replace(3, "Pear", "Pomegranate"); // if the key and value matches, the new value will be assigned
        System.out.println(map);

        map.replace(3, "pear", "Pomegranate"); // if either the key or value or both doesnt match, nothing will be assigned
        System.out.println(map);

        System.out.println(map.containsKey(5));//will return false
        System.out.println(map.containsValue("Apple"));

        System.out.println(map.getOrDefault(13, "Nothing"));


    }
}
