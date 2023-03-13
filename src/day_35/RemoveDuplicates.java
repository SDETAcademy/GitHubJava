package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "bbbffggdsfcfghsg"; // bfgdsch
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        String collect1 = list.stream().distinct().collect(Collectors.joining());
        System.out.println(collect1);


    }
}
