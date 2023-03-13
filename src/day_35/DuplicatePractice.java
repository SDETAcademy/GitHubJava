package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DuplicatePractice {
    public static void main(String[] args) {
        /**
         *
         * String str = "zzpppoyyyyy" // create a program that will store only unique elements and elements with frequency
         * of more than 3
         * Return the result as a String
         * "zzpppoyyyyy" = "oyyyyy"
         */

        String str = "ZZPPPyyyyA";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String collect = list.stream().filter(s -> Collections.frequency(list, s) > 3 || Collections.frequency(list, s) == 1)
                .collect(Collectors.joining());

        System.out.println(collect);

    }
}
