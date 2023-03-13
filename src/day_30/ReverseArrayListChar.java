package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayListChar {
    public static void main(String[] args) {

        /**
         * 1. Create a new empty arraylist
         * 2. Use 1 loop to iterate backwards
         * 3. Keep adding the values to our new list using add() method
         */

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a','b','c','d','f'));
        ArrayList<Character> charReversed = new ArrayList<>();
        for (int i = charList.size()-1; i >= 0; i--) {
            charReversed.add(charList.get(i));
        }
        System.out.println(charReversed);

    }
}
