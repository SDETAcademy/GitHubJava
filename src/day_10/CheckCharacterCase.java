package day_10;

public class CheckCharacterCase {
    public static void main(String[] args){

        /**
         * isEmpty() - applied to String and return type is boolean;
         */

        String name = "";
        System.out.println(!name.isEmpty());

//        isEmpty, isRaining, isWeekend


        /**
         * Create a program, the will determine if the character is Upper case or not.
         * Use variables of your choice
         */

        String character = "K";
        String characterTwo = character.toUpperCase();

        if(character.isEmpty()){
            System.out.println("The character is empty");
        }else if(character.equals(characterTwo)){
            System.out.println("The Character is UPPER CASE");
        }else {
            System.out.println("The character is lower case");
        }


        String originalCharacter = "o";// O
        String lowerCaseCharacter = originalCharacter.toLowerCase(); //o

        if(originalCharacter.isEmpty()){
            System.out.println("The string is empty");
        }else if(originalCharacter.equals(lowerCaseCharacter)){
            System.out.println("The character is lower case");
        }else{
            System.out.println("The character is UPPER CASE");
        }








    }
}
