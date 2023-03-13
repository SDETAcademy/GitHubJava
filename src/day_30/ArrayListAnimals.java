package day_30;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAnimals {
    public static void main(String[] args) {

        /**
         * Create a custom method, that will accept an ArrayList of Strings
         * 1. It will delete the last element
         * 2. It will make first element to Upper Case
         * 3. Second element to lower case
         */

        String str = "Cat, Dog, Mice, Moose, Deer";
        System.out.println(modifyingAnimals(str));
        //[Cat, Dog, Parrot]
        //[CAT, dog]
        //[Cat, Dog, Parrot, Alligator, Cow]
        //[CAT, dog, Parrot, Alligator]

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Moose", "Goose", "Chicken", "Deer", "Hog"));
        System.out.println(modifyingAnimals(myList));
        String[] strArr = {"Dog", "Cat", "Mice"};
        System.out.println(modifyingAnimals(strArr));


    }

    public static ArrayList<String> modifyingAnimals(ArrayList<String> list) {// overload the method and accept String[]

        if (list.size() < 3) {
            return list;
        } else {
            list.remove(list.size() - 1);
            list.set(0, list.get(0).toUpperCase());
            list.set(1, list.get(1).toLowerCase());
            return list;
        }
    }

    public static ArrayList<String> modifyingAnimals(String[] strArr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
        if (list.size() < 3) {
            return list;
        } else {
            list.remove(list.size() - 1);
            list.set(0, list.get(0).toUpperCase());
            list.set(1, list.get(1).toLowerCase());
            return list;
        }
    }

    public static ArrayList<String> modifyingAnimals(String str) {
        String[] split = str.split(", ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));

        if (list.size() < 3) {
            return list;
        } else {
            list.remove(list.size() - 1);
            list.set(0, list.get(0).toUpperCase());
            list.set(1, list.get(1).toLowerCase());
            return list;

        }


    }
}
