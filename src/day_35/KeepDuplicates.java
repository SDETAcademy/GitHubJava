package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class KeepDuplicates {
    public static void main(String[] args) {

        String str = "aabcccd";// aaccc

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        String collect = list.stream().filter(s -> Collections.frequency(list, s) > 1)
                .collect(Collectors.joining());
        System.out.println(collect);


    }
}
