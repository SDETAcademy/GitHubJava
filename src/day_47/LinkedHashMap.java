package day_47;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {

        Map<String, Boolean> hashMap = new HashMap<>();
        Map<String, Boolean> linkedHashMap = new java.util.LinkedHashMap<>();

        hashMap.put("Tatsiana", true);
        hashMap.put("Tatsiana", true);
        hashMap.put("Mu", false);
        hashMap.put("Julian", false);
        hashMap.put("Tatsiana", true);
        hashMap.put("Roman", false);
        hashMap.put("Maria", true);
        hashMap.put("Cornelia", true);
        hashMap.put("Cornelia", true);
        System.out.println(hashMap);

        linkedHashMap.put("Tatsiana", true);
        linkedHashMap.put("Tatsiana", true);
        linkedHashMap.put("Mu", false);
        linkedHashMap.put("Julian", false);
        linkedHashMap.put("Tatsiana", true);
        linkedHashMap.put("Roman", false);
        linkedHashMap.put("Maria", true);
        linkedHashMap.put("Cornelia", true);
        linkedHashMap.put("Cornelia", true);
        System.out.println(linkedHashMap);
    }
}
