package day_15;

public class PrintRangeOfEvenNumbers {
    public static void main(String[] args) {


        /**
         * Create a program. that will print only even numbers in the range between 80 and 20
         * Example: 80 78, 76, .... 20
         */

        for (int n = 81; n>=20; n-=3){
            System.out.println(n);
        }

    }
}
