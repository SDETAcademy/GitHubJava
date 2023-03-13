package day_23;

public class SwapVariablesRepetition {
    public static void main(String[] args) {


        /**
         * Swapping two variables
         */
        int a = 10;
        int b = 15;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);


        int x = 5;
        int y = 10;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);


    }
}
