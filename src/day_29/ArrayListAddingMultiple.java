package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAddingMultiple {
    public static void main(String[] args) {

        String str = "Java is fun";
        String[] split = str.split("");// [J, a, v, a,  , i, s,  , f, u, n]

        ArrayList<String> myList = new ArrayList<>(Arrays.asList(split));
        System.out.println(myList);

        int[] numArr = {1,4,2,5,2};
        Integer[] nonPrimitiveArray = {1,4,2,5,2};

        ArrayList<Integer> myIntegerList = new ArrayList<>(Arrays.asList(nonPrimitiveArray));
        System.out.println(myIntegerList);

        for (int each : numArr) {
            myIntegerList.add(each);
        }
        System.out.println(myIntegerList);





    }
}
