package day_30;

import java.util.ArrayList;

public class ArraylistRecap {
    public static void main(String[] args) {
        /**
         * Arrays work with non primitives and primitives.
         * - Takes very little memory because it can work with primitives
         * - fast
         * - The biggest downside of the array - fixed length.
         * ArrayList - can work with non primitive data type
         * - takes more memory, but for the benefits:
         * - the size is dynamic
         * - we have more methods we can use
         * - we can add elements in any order(specifying the index)
         * - arraylists will be used more often at work
         */

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size()); // return type is int(whole number)
        System.out.println(list.isEmpty());// return type is boolean
        list.add("Java"); // we adding elements starting from the beginning and moving forward
        list.add("Python");
        list.add("Python");
        list.add("Python");
        list.add("C#");//C Sharp
        System.out.println(list);
        list.add(0, "JavaScript");// we adding an element to a specific place using index
        System.out.println(list);
        list.remove("Python");//will remove only 1 element with this specific value
        System.out.println(list);
        list.remove(3);// will remove element with specified index
        System.out.println(list);
        list.set(3, "C++");// we specify element with what index we want to change and then the new value
        System.out.println(list);
        list.remove(list.size()-1);// we provide an index of the element we want to remove from our list
        list.add("C#");
        System.out.println(list);
        list.clear();// will remove all the elements form list
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());








    }
}
