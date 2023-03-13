package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueChars {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', 'b', 'a', 'c', 'd', 'a', 'd'));
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            if(!result.contains("" + list.get(i))){
                result+=list.get(i);
            }
        }

        System.out.println(result);
        ArrayList<Character> uniqueList = new ArrayList<>(Arrays.asList());

        for (int i =0; i<result.length(); i++){
            uniqueList.add(result.charAt(i));
        }
        System.out.println(uniqueList);

    }
}
