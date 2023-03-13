package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversingArrayList {
    public static void main(String[] args) {

//
//        ArrayList<Integer> numListTwo = new ArrayList<>(Arrays.asList(1,2,5,25,5,4,3,5));
//        System.out.println(numListTwo);

        int[] numArr = {1,2,5,25,5,4,3,5};

        ArrayList<Integer> numList = new ArrayList<>();

        for (int each : numArr) {
            numList.add(each);

        }


        String[] listStr = {"Java", "JavaScript", "Python", "C#"};
        System.out.println(Arrays.toString(listStr));
        System.out.println(reverseArrayList(listStr));



    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> numList){
        ArrayList<Integer> numListReversed = new ArrayList<>();
        for (int i = numList.size()-1; i >=0; i--) {
            numListReversed.add(numList.get(i));
        }
        return numListReversed;
    }

    public static ArrayList<String> reverseArrayList(String[] strArr){

        ArrayList<String> reversedList = new ArrayList<>(Arrays.asList(strArr));
        ArrayList<String> result = new ArrayList<>();
        for (int i = reversedList.size()-1; i >=0; i--) {
            reversedList.add(result.get(i));
        }
        return reversedList;
    }

}
