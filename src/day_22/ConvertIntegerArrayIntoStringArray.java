package day_22;

import java.util.Arrays;

public class ConvertIntegerArrayIntoStringArray {
    public static void main(String[] args) {

        /**
         * Given an int[] please convert it into a String[]
         * Also please make sure the conversion took place()
         */

        int[] numArr = {1,3,5,6,7,45,67,98,8};

        String result = Arrays.toString(numArr);
        System.out.println(result + "*");
        result = result.replace("[", "");
        System.out.println(result);
        result = result.replace("]", "");
        System.out.println(result);

        String[] strArr = result.split(", ");


        System.out.println(strArr[0] + strArr[1]);


        /**
         * 1.
         */





    }
}
