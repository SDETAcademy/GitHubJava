package day_30;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        /**
         *Create an ArrayList of Strings. Add all the programming languages you know(1 by 1)
         * 1. Print your 3 favorite ones(using hardcoded indexes).
         * 2. Remove all the languages that you don't like from your list and print list again
         * 3. Rename every element in your ArrayList so it starts with lower case and print the list again
         * 4. Delete all elements from your list and assert the list is empty.
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Selenium");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(3);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        list.set(0, "java");
        System.out.println(list);
        System.out.println(list.get(1).toLowerCase());
        String str = list.get(1).toLowerCase();
        System.out.println(str);
        System.out.println(list);

        list.set(1, list.get(1).toLowerCase());// String
        System.out.println(list);
        list.set(2, "c++");
        System.out.println(list);

        list.clear();
        System.out.println(list.isEmpty());

    }

    }

