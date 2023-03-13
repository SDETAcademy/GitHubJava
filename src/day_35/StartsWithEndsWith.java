package day_35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        //[Cat, Cocot]
        ArrayList<String> list =new ArrayList<>(Arrays.asList("Dog", "Car", "Cat","Coot", "Bat", "Elephant"));

        System.out.println(startsWithC(list));

    }
    public static String startsWithC(ArrayList<String> list) {
        String c = list.stream().filter(n -> n.startsWith("C") && n.endsWith("t")).collect(Collectors.joining());
        return c;
    }

    }

