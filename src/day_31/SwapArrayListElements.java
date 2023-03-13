package day_31;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapArrayListElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("d","c","b","a","e"));//0,3

        System.out.println(swapElements(list, 0, 3));


    }

    public static ArrayList<String> swapElements(ArrayList<String> shuffledList, int firstIndex, int lastIndex){
//                                                                                      a               b
        String temp = "";
        temp = shuffledList.get(firstIndex); // d
        shuffledList.set(firstIndex, shuffledList.get(lastIndex));
        shuffledList.set(lastIndex, temp);
        return shuffledList;
    }
}
