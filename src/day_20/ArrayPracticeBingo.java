package day_20;

public class ArrayPracticeBingo {
    public static void main(String[] args) {

        /**
         *Given an array of int:
         *         int[] arr = {0,5,1,9,0,48,6,48,0,0,65,510,0,65,98,0,0,64,98,40,9};
         *         Iterate through every element in your array and anytime the element is 0
         *         print Bingo
         */

        int[] numArr = {0, 5, 1, 9, 0, 48, 6, 48, 0, 0, 65, 510, 0, 65, 98, 0, 0, 64, 98, 40, 9};
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                System.out.println(numArr[i] + " bingo");
            }
        }


        /**
         *Given an array of int:
         *         int[] arr = {0,5,1,9,0,48,6,48,0,0,65,510,0,65,98,0,0,64,98,40,9};
         *         Iterate starting from the end and going towards the beginning of your array
         *         through every element in your array and anytime the element is 0
         *         print Bingo, else - print " Not Bingo"
         */

        int[] arr = {0,5,1,9,0,48,6,48,0,0,65,510,0,65,98,0,0,64,98,40,0};
        for (int i=arr.length-1; i>=0; i--){

            if(arr[i]==0) {
                System.out.println(arr[i] + " bingo");
            }else{
                System.out.println(arr[i] + " not bingo");
            }
        }


    }
}
