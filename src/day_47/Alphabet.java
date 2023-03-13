package day_47;

import java.util.LinkedHashMap;
import java.util.Map;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabetChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // a=1, b=2, c=3
        System.out.println(alphabetNumber(alphabetChar));

    }

    public static Map<Character, Integer> alphabetNumber(char[] charArr) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int num= 1;
        for (char each : charArr) {
            map.put(each, num++);
        }
        return map;
    }
}
