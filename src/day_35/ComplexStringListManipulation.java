package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexStringListManipulation {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Jav a","Ja va",  "ja VA","pyth ON", "PYTHON", "P Y TH O N", "Pa ascal", "K ot lin", "korLIN"));
        //[java, java, java, python, python, python]

        List<String> collect = list.stream()
                .map(n -> n.replace(" ", "").toLowerCase())
                .collect(Collectors.toList());
        List<String> collect1 = collect.stream().filter(s -> Collections.frequency(collect, s) > 2).collect(Collectors.toList());

        List<String> collect2 = list.stream().map(s -> s.replace(" ", "").toLowerCase())
                .filter(s -> Collections.frequency(list, s) > 2).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);


    }
}
