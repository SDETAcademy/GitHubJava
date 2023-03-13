package day_24;

import java.util.Arrays;

public class MultidimensionalArrayInteger {
    public static void main(String[] args) {

        int [][] numArray = {
                {-1,-2,-3,-4,-5},
                {0,0},
                {1,3,5,7,9},
                {2,4,6,8,10,12,14},
                {100,200,300,400}
        };

        System.out.println(Arrays.deepToString(numArray));
        System.out.println(numArray[4][3]);



    }
}
