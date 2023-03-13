package day_22;

import java.util.Arrays;

public class ForEachConvertArray {
    public static void main(String[] args) {


        /**
         * Given an int[] please convert it into a String[]
         * Also please make sure the conversion took place()
         * USE ONLY FOR EACH LOOP
         */

        int[] numArr = {2,45,6,7,98};
        String result = "";
        for (int each : numArr) {
            result+=each;
        }
        String[] strArr = result.split("");
        System.out.println(Arrays.toString(strArr));


    }
}
