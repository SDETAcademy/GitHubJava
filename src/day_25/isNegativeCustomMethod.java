package day_25;

public class isNegativeCustomMethod {

    public static void main(String[] args) {
        /**
         * Create a custom method called isNegative that will accept 1 int variable
         * and will return true if the number is negative and false if the number is positive
         */
        int a = -10;
        System.out.println(isNegative(a + 10)); //0

    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

}
