package day_10;

public class LengthOddOrEven {
    public static void main(String[] args){

        /**
         * create a program, that will have String variable sentence;
         * check if the string is not empty, and determine if the number of all characters in the string
         * is odd or even
         */

        String sentence = "";

        int length = sentence.length();

        if(length==0){
            System.out.println("The sentence is empty");
        }else if(length%2==0){
            System.out.println("The sentence is even");
        }else{
            System.out.println("The sentence is odd");
        }


    }
}
