package day_17;

public class FrequencyOfACharacter {
    public static void main(String[] args) {

        /**
         Create a program that will accept char from user with scanner and cout the frequence of the character
         */
        String str = "Today is the day when I fell in love with Java";

        char character = 'a';
        int count = 0;


        for (int i = 0; i<str.length(); i++){
            if(character==str.charAt(i)){
                count++;
            }
        }

        System.out.println(count);

    }
}
