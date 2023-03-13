package day_19;

public class NestedForLoopDayOne {
    public static void main(String[] args) {


        /**
         * create a program called clock that will be using nested for loop for min and sec and imitate clock
         */

        for (int min = 0; min < 5; min ++){
            System.out.println("Beginning of the practice");
            for (int sec = 0; sec < 60; sec++){
                System.out.println(min + ": " + sec);
            }
            System.out.println("We are just practicing");
        }



    }
}
