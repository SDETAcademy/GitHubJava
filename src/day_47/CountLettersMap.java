package day_47;

import java.util.LinkedHashMap;
import java.util.*;

public class CountLettersMap {
    public static void main(String[] args) {
        String str = "AAABBBCCCCADDDUUFFEEYY";//[A,A,A,B,B,B,B....]
        //A=4, B=3, C4, D=4....Y=2
        //A4B3C4
        System.out.println(countLetters(str));
    }
    public static String countLetters(String word){
        String result = "";
        List<String> strList = new ArrayList<>(Arrays.asList(word.split("")));
        Map<String, Integer> resultMap = new LinkedHashMap<>();
//        System.out.println(strList);

        for (String each : strList) {
            resultMap.put(each, Collections.frequency(strList, each));
        }
//        System.out.println(resultMap);

        for (Map.Entry<String, Integer> eachSet : resultMap.entrySet()) {
            result+=eachSet.getKey() + eachSet.getValue();
        }
        return result;
    }
}
