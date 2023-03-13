package day_25;

public class CustomConcatenationMethod {
    public static void main(String[] args) {
        /**
         * Please create 2 custom methods, that will concatenate 2 variables(int)
         * 1. First method will return nothing
         * 2. Second will return String
         * Example: 10 + 15 = 1015;
         */

        int numOne = 15;
        int numTwo = 25;
        concatVersionOne(numOne, numTwo);
        System.out.println(concatVersionTwo(numOne, numTwo));
    }

    public static void concatVersionOne(int a, int b){
        String result = "" + a + b;
        System.out.println(result);
    }

    public static String concatVersionTwo(int a, int b){
        String result = "" + a +b;
        return result;
    }



}
