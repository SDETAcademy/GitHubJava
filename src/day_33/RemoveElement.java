package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,-9,-4,-1,-6,5,6,7));

        //1
        // 21959 nanoSec = 0.021959 milliSec
        long startTimeModifyingList = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<0){
                list.remove(i);
                i--;
            }
        }
        long endTimeModifyingList = System.nanoTime();
        System.out.println("Modifying existing list will take " + (endTimeModifyingList-startTimeModifyingList) + " nanoSec");


//2.
        long startTimeNewList = System.nanoTime();
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(each >= 0){
                result.add(each);
            }
        }
        long endTimeNewList = System.nanoTime();
        System.out.println("Creating a new list will take " + (endTimeNewList-startTimeNewList) + " nanoSec");

//3.
        long startTimeLambda = System.nanoTime();
        list.removeIf(n->n<0);
        long endTimeLambda = System.nanoTime();
        System.out.println("Using lambda will take " + (endTimeLambda - startTimeLambda) + " nanoSec");
    }
}
