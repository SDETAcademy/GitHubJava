package day_10;

public class IndexOfPractice {
    public static void main(String[] args){

        /**
         * Please create a program that will print the index of the character
         * If the character is unique - either you use indexOf() or you use lastIndexOf() - the output will be the same number
         * If the character is a duplicate - indexOf() will give you the index of the first occurrence of the character you are looking for
         * and lastIndexOf() - will give you the index of last character you are looking for
         * if we are looking for the character that is not in the sentence, either we use indexOf() or lastIndexOf() -
         * java will give us -1;
         *
         */
        String sentence = "Today is a very lovely day for tennis";
        char character = 't';
        int index = sentence.indexOf(character);
        int indexTwo = sentence.lastIndexOf(character);
        System.out.println(index);
        System.out.println(indexTwo);



    }
}
