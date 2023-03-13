package day_25;

public class ReturnTheSum {

    /**
     * Create the custom method that will give you the result of x+y
     * Create the custom method that will give you the result of x-y
     * Create the custom method that will give you the result of x/y
     * Create the custom method that will give you the result of x*y
     * Create the custom method that will give you the result of x%y
     */

    public static int additionSum(int x, int y){
        int sum = x +y ;
        return sum;
    }

    public static int deductionSum(int x, int y, String str){
        int result = x-y;
        return result;
    }
    public static int deductionSum(String str, int x, int y){
        int result = x-y;
        return result;
    }

    public static double deductionSum(double x, double y){
        double result = x-y;
        return result;
    }
    public static int deductionSum(int x, int y){
        int result = x-y;
        return result;
    }




    public static void main(String[] args) {
        int x = 99;
        int y = 105;

        double a = 10.0;
        double b = 10.0;
        String word = "Hello";

        System.out.println(x+y);
        System.out.println(additionSum(x, y));
        System.out.println(deductionSum(x, y));
        System.out.println(deductionSum(a, b));
        System.out.println(deductionSum(word, x ,y));
        System.out.println(deductionSum(x ,y, word));

    }



}

