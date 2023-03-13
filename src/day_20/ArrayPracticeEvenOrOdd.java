package day_20;


public class ArrayPracticeEvenOrOdd {

    public static void main(String[] args) {
        /**
         * Create a program that will have int[] with at least 20 different values in it.
         * Loop through them and determine if the number is odd or even(disregard 0 for now)
         */

        int[] arr = {1,5,6,7,3,78,9,202,10,4,684,56,795,9,7,6,4,35,26,89};

        for (int i = 0; i<arr.length; i++ ){

            if(arr[i]%2 == 0){
                System.out.println(arr[i] + " is even");
            }else{
                System.out.println(arr[i] + " is odd");
            }
        }




    }
}
