package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLastCharacter {
    public static void main(String[] args) {
        /**
         * 1. Given a list of strings, return a list where each string has it's last character removed
         * [Java, Python, Pascal]
         * [Jav, Pytho, Pasca]
         * 2. Make every element to UpperCase()
         * [Jav, Pytho, Pasca]
         * [JAV, PYTHO, PASCA]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Pascal"));
        ArrayList<String> newList = new ArrayList<>();

        for (String each : list) {
            newList.add(each.substring(0,each.length()-1).toUpperCase());
        }
        System.out.println(newList);

        list.replaceAll(n->n.substring(0, n.length()-1).toUpperCase());
        System.out.println(list);


//        list.replaceAll(n->n.replace("" + n.charAt(n.length()-1), ""));
//        System.out.println(list);
//        list.replaceAll(n->n.toUpperCase());
//        System.out.println(list);



    }
}
