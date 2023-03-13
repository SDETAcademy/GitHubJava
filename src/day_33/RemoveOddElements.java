package day_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveOddElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 3, 16, 4, 68, 4876, 456, 49, 8794, 66, 797, 46, 49, 768, 49));
        list.removeIf(n -> n % 2 == 1);

        ArrayList<Integer> listLoop = new ArrayList<>(Arrays.asList(1, 3, 3, 16, 4, 68, 4876, 456, 49, 8794, 66, 797, 46, 49, 768, 49));
        long startTimeCollections = System.nanoTime();
        Collections.sort(list);
        long endTimeCollections = System.nanoTime();
        System.out.println("Collections " + (endTimeCollections-startTimeCollections)); //122333 vs 35459

        long startTimeLoop = System.nanoTime();
        for (int i = 1; i < listLoop.size(); i++) {
            for (int j = 0; j < listLoop.size(); j++) {
                if (listLoop.get(i) < listLoop.get(j)) {
                    int temp = listLoop.get(i);
                    listLoop.set(i, listLoop.get(j));
                    listLoop.set(j, temp);
                }
            }
        }
        long endTimeLoop = System.nanoTime();
        System.out.println("Loop will take " + (endTimeLoop - startTimeLoop));


    }
}
