package day_15;

public class ForLoopIntroduction {
    public static void main(String[] args) {

        /**
         * 1. While loop - first we have a condition and then code execution if the condition is true
         * 2. Do While loop - first we have code execution. regardless of the condition. If condition is true. we will iterate
         * in the loop. else we will continue going down
         * 3. Today is an intro for For loop
         */

//        for (int i = 10; i > 0; i--){
//            System.out.print(i + " ");
//        }

        String str = "cat"; // contains()
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

    }
}
