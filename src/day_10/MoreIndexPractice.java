package day_10;

public class MoreIndexPractice {
    public static void main(String[] args){

        /**
         * Create a program that will determine if the last character of the String sentence is UPPER CASE
         * Use any additional variables as you see fit.
         * PS. Don't forget to check if the sentence is empty.
         */

        String sentence = "Today is Saturday";

        if(sentence.isEmpty()){
            System.out.println("Sentence is Empty!!!");
        }else{
            int length = sentence.length();
            String lastCharacter = "" + sentence.charAt(length - 1);
            if(lastCharacter.toLowerCase().equals(lastCharacter)){
                System.out.println("The character is lower case");
            }else {
                System.out.println("The character is UPPER CASE");
            }
        }





    }
}
