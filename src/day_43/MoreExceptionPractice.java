package day_43;

public class MoreExceptionPractice {
    public static void main(String[] args) {
        /**
         * Declare and initialize String variable to null;
         * Print out the length of your variable
         * Handle the exception with try/catch block(DO NOT USE EXCEPTION OR THROWABLE)
         *
         */
        String str = null;
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("catch exception ");
        }
        System.out.println("the end");


    }
}
