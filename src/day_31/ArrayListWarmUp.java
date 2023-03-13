package day_31;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWarmUp {
    public static void main(String[] args) {
        /**
         * Create a custom method that will accept 2 parameters, 1. ArrayList<String> 2.String.
         * The program will count the frequency of the String in our ArrayList.
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Java", "JavaScript", "Java", "C++", "C#", "C#"));
        //Java - will return 3
        //C++ - will return 1
        //C# - will return 2
        String str = "java";

        System.out.println(countStringsInTheList(list, str));

    }

    public static int countStringsInTheList(ArrayList<String> list, String str) {
        int count = 0;
        for (String each : list) {
            if (each.equalsIgnoreCase(str)) {
                count++;
            }
        }
        return count;
    }
    public static int countStringsInTheList(String str, ArrayList<String> list){
        int count = 0;
        for (String each : list) {
            if (each.equalsIgnoreCase(str)) {
                count++;
            }
        }
        return count;
    }

}
