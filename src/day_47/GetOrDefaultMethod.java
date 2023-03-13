package day_47;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "JavaScript");
        map.put(3, "Kotlin");
        map.put(4, "C#");
        map.put(5, "C++");

        System.out.println(map.getOrDefault(6, "Doesn't Exist"));

    }
}
