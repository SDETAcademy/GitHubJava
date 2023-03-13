package day_25;

import java.util.Arrays;

public class SwapTwoVariablesMethod {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println(Arrays.toString(swapTwoVariables(x,y)));

        int resultOfSwapping = swapTwoVariables(x,y)[0];



        System.out.println(resultOfSwapping);

        int a = 10 + resultOfSwapping;


    }

    public static int[] swapTwoVariables(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        int[] numArr = {a,b};
        return numArr;
    }

}
