package day_27;

public class OverloadingPractice {
    public static void main(String[] args) {

        /**
         * Create a custom method that will multiply 2 doubles, 2 integers and varargs of doubles;
         * Choose the return type you wish.
         * VarArgs
         * Variable number of Arguments
         */

        int x = 10;
        int y = 20;
        double z = 10.3;
        double w = 11.7;
        System.out.println(multiplication(x, y));
        System.out.println(multiplication(z, w));
        System.out.println(multiplication(x,y, 10));

    }


    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double multiplication(double ... myVarArgs){
        double sum = 0;
        for (double each : myVarArgs) {
            sum+=each;
        }
        return sum;
    }

}
