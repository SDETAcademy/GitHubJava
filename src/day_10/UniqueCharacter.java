package day_10;

public class UniqueCharacter {
    public static void main(String[] args){

        /**
         * Create a program that will determine if the character is unique.
         * String sentence, char character + ..... isUnique boolean variable.
         * as a bonus - make sure the char is present, and if string is not empty.
         */
        String sentence = "I am from Indoor";
        char a = 'f';
        int index = sentence.indexOf(a);
        int lastIndex = sentence.lastIndexOf(a);

        if (sentence.isEmpty() || index == -1)  {
            System.out.println("Sentence is Empty or character is not there");
        }  else  {
            String isUnique = "";
            isUnique = (index == lastIndex) ? "Unique": "Not Unique";
            System.out.println(isUnique);
        }


    }
}
