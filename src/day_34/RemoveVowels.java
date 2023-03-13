package day_34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowels {
    public static void main(String[] args) {

        //a,e,i,o,u
        /**
         * Create a program that will remove all the vowels from each element of your Array of Strings.
         */
        String[] strArrThree = {"Hamster", "Wolf", "Snake", "Deer", "Hog", "Pig", "Dog", "Cat"};
        List<String> collect = Arrays.stream(strArrThree)
                .map(s -> s.replace("a", "")
                        .replace("e", "")
                        .replace("i", "")
                        .replace("o", "")
                        .replace("u", ""))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
