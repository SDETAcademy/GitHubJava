package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingStarBetweenElement {
    public static void main(String[] args) {

        //[car, cat, dog, lime] - ArraylistOf Strings
        //[*car*, *cat*, *dog*, *lime*]
        ArrayList<String> list = new ArrayList<>(Arrays.asList("car", "dog","lime","lemon","fruit"));
        list.replaceAll(n ->"*" +  n + "*");
        System.out.println(list);

    }
}
