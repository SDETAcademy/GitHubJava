package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class CallingMethodsInLambdas {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));

        list.replaceAll(n->reverseStr(n));
        System.out.println(list);

        String str = "Hello World";
        System.out.println(reverseStr(str));


    }

    public static String reverseStr(String str){
        StringBuilder result = new StringBuilder(str); //str
        result.reverse();
        return result.toString();
    }
}
