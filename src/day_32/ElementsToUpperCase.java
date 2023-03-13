package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementsToUpperCase {
    public static void main(String[] args) {

        /**
         * [java, python, c++, pascal, javaScript] - make every element to upper case please
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Java", "JavaScript","Java", "C++", "C#", "C#"));
        list.replaceAll(n->n.toUpperCase());
        System.out.println(list);


    }
}
