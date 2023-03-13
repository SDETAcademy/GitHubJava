package day_23;


import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {


        /**
         * Given an array of boolean, Sort An Array in  ascending order(using Arrays.sort() method), and then reverse.
         */

        boolean [] arr = {true, false, false, true};
        boolean temp;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j<arr.length; j++){
                if(!arr[i]){
                    //int x    int y
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        System.out.println(Arrays.toString(arr));

//stackoverflow

    }
}
