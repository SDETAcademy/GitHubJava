package day_34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringIntroStreamsTwo {
    public static void main(String[] args) {
        String[] strArr = {"Cat", "cat", "Dog", "Map", "Gas", "Bat"};
        List<String> list = Arrays.stream(strArr).sorted()
                .map(s -> s.toLowerCase()).collect(Collectors.toList());

        System.out.println(list);

        String[] strArrTwo = {"Hamster", "Wolf", "Snake", "Deer", "Hog", "Pig", "Dog", "Cat"};
        List<String> collect = Arrays.stream(strArrTwo)
                .filter(s -> s.startsWith("C") || s.startsWith("D") || s.startsWith("H"))
                .collect(Collectors.toList());
        System.out.println(collect);


        String[] strArrThree = {"Hamster", "Wolf", "Snake", "Deer", "Hog", "Pig", "Dog", "Cat"};
//        save only the elements in your array that have length more than 3
        List<String> collect1 = Arrays.stream(strArrThree).filter(s -> s.length() > 3).collect(Collectors.toList());
        System.out.println(collect1);

        /**
         * Given an array of Strings, create a custom method, that will reverse each element in your array.
         */
        String[] strArrFour = {"Hamster", "Wolf", "Snake", "Deer", "Hog", "Pig", "Dog", "Cat"};
        List<String> collect2 = Arrays.stream(strArrFour).map(s -> reverseStr(s)).collect(Collectors.toList());
        System.out.println(collect2);

    }

    public static String reverseStr(String str){
        return new StringBuilder(str).reverse().toString();
    }
}



