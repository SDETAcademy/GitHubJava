package day_32;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatElement {
    public static void main(String[] args) {
        /**
         * given you have an arrayList of Strings that looks something like: [Java, Python, C++, JavaScript, Pascal]
         * you should create a custom method, that will do the double each element. Result should be:
         * [JavaJava, PythonPython, C++C++, JavaScriptJavaScript].
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","Python","C++","JavaScript"));
        list.replaceAll(n -> n.repeat(3));
        System.out.println(list);
//
//        ArrayList<String> result = new ArrayList<>();
//        for (String each : list) {
//            result.add(each+each);
//        }

    }



}
