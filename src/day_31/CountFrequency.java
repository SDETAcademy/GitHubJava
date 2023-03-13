package day_31;

import java.util.ArrayList;
import java.util.Collections;

public class CountFrequency {
    public static void main(String[] args) {

        String str = "Java is fun and JavaScript is not";
        char[] charArray = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char each : charArray) {
            System.out.println(list);
            list.add(each);
        }
        System.out.println(list);

        System.out.println(countCharacter(list, 'a'));

    }



    public static int countCharacter(ArrayList<Character> list, char character) {
        return Collections.frequency(list, character);
    }
}
