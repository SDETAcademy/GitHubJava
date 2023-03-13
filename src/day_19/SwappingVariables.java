package day_19;

public class SwappingVariables {
    public static void main(String[] args) {

        /**
         * Swap two variables:
         * - using a temp variable
         * - using no additional variable
         */


        int a = 15; // 10
        int b = 10; // 15
        int temp;


        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


        int x = 10;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);










    }
}
