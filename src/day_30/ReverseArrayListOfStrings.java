package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayListOfStrings {
    public static void main(String[] args) {


        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "C#"));
        ArrayList<String> reversedList = new ArrayList<>();


        for (int i = listStr.size()-1; i >=0; i--) {
            reversedList.add(listStr.get(i));
        }

        System.out.println(listStr);
        System.out.println(reversedList);





    }
}
