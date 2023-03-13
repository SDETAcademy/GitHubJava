package day_11;

import java.util.Random;

public class ReplacementPractice {
    public static void main(String[] args){

        String str = "Java is better than JavaScript";
        String strTwo = str.replace("a", "o");
        String strThree = str.replace('e', 'a');
        System.out.println(str.replace("a", "o"));//toLoweCase, toUpperCase
        System.out.println(str);
        System.out.println(strTwo);
        System.out.println(strThree);

        String strFour = str.replaceFirst("a", "e");
        System.out.println(strFour);

        String strFive = strFour.replaceAll("a", "e");
        System.out.println(strFive);

                //regex - Regular Expression

        //replace
        //replaceFirst
        //replaceAll - not yet

        /**
         * create a random picker (int), and create a random sentence(String);
         * if random is 0 - replace the first character with "z"
         * if random is 1 = replace all "a" with "z"
         */

        Random random = new Random();
        int picker = random.nextInt(2);
        // j - replace all j in the sentence
        String sentence = "Java is my first programming language";

        if(picker==0){
            String character = "" + sentence.charAt(0);
            System.out.println(sentence.replaceFirst(character, "z"));
        }else{
            System.out.println(sentence.replace("a", "z"));
        }











    }
}
