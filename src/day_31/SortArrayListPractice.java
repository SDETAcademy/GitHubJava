package day_31;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListPractice {
    public static void main(String[] args) {


        /**
         * Create 2 custom methods that will sort an ArrayList in:
         * 1. Sort in ascending order
         * 2. Sort in descending order
         * 3. Shuffle the arrayList
         */


    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public static ArrayList<Integer> sortDescending(ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public static ArrayList<Integer> shuffleCustomMethod(ArrayList<Integer> list){
        Collections.shuffle(list);
        return list;
    }

}
