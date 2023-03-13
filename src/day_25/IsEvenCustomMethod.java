package day_25;

public class IsEvenCustomMethod {
    public static void main(String[] args) {

        /**
         * Create a custom method called isEven, that will accept 1 int variable and will return a isEven boolean.
         * If the number is even, isEven = true, else - false
         */

        int x = 10;
        System.out.println(isEven(x));
    }

    public static boolean isEven(int a){
        return a%2==0;
    }

}
