package day_10;

public class IndexPractice {
    public static void main(String[] args){

        /**
         * Create a string sentence variable.
         * And let's check if the last character of the sentence is Upper or lower case.
         * Use any additional variables and any methods you wish;
         * Also, please check if sentence is not empty!
         */

        String sentence = "Today is a great  day to learn javA";


        if(!sentence.isEmpty()){
            int length = sentence.length(); // calculate the length of the sentence
            String lastCharacter = "" + sentence.charAt(length-1);// determine the index of the last character
            String lowerCaseCharacter = lastCharacter.toLowerCase();// verify if the last  character is lower case
            if(lowerCaseCharacter.equals(lastCharacter)){
                System.out.println("The character is lower case");
            }else{
                System.out.println("The character is UUPER CASE");
            }

        }else{
            System.out.println("The sentence is empty");
        }
    }
}
