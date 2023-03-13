package day_24;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        /**
         * silent and listen
         * earth and heart
         * triangle and integral
         * study and dusty
         * cat and act // act and act
         * art and rat
         * god and dog //dgo and dot
         */

        boolean isAnagram = true;
        String strOne = "streveudy";
        String strTwo = "dusty";
        char[] strOneChar = {};
        char[] strTwoChar = {};

        if(strOne.length()!=strTwo.length()){
            isAnagram = false;
        }else{
            strOneChar = strOne.toCharArray(); //[e,a,r,t,h]
            strTwoChar = strTwo.toCharArray();// [h,e,ar,t]
            System.out.println("Before sorting");
            System.out.println(Arrays.toString(strOneChar));
            System.out.println(Arrays.toString(strTwoChar));
            System.out.println(Arrays.equals(strOneChar, strTwoChar));
            Arrays.sort(strOneChar);// 1 nested for loop
            Arrays.sort(strTwoChar);// 1 nested for loop
            System.out.println("After sorting");
            System.out.println(Arrays.toString(strOneChar));
            System.out.println(Arrays.toString(strTwoChar));
            System.out.println(Arrays.equals(strOneChar, strTwoChar));
            if(Arrays.equals(strOneChar, strTwoChar)){
                isAnagram = true;
            }
        }


        System.out.println(isAnagram);


/**
 * 1. We check the length - if not equal then it's not an anagram
 * 2. let's turn it into an array
 * 3. sort it and check if equal
 */

    }
}
