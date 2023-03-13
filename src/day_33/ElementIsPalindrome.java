package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementIsPalindrome {
    public static void main(String[] args) {

        /**
         * Given you have an ArrayList<String> = [civic, radar, dog, god, cat, noon] remove a non palindrome elements
         * Result: [civic, radar, noon]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("civ ic", "rAdar", "cat", "dog", "moon"));
        list.removeIf(n-> !isPalindrome(n));
        System.out.println(list);


    }
    public static boolean isPalindrome(String str){
        String word = str.replace(" ", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(word);
        reverse.reverse();
        return word.equals(reverse.toString());
    }
}
