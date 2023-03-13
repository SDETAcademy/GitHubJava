package day_25;

public class IndexOfCustomMethod {
    public static void main(String[] args) {

        /**
         * Create a custom indexOfMethod(), that will return the first index of the target letter,
         * but if the letter is not present - return -2. If the str is empty return -3;
         */

        String str = "";

        System.out.println(indexOfCustomMethod(str, "y"));


    }

    public static int indexOfCustomMethod(String word, String letter){
        if(word.isEmpty()){
            return word.indexOf(letter)-2;
        }else if(!word.contains(letter)){
            return word.indexOf(letter)-1;
        }else {
            return word.indexOf(letter);
        }
    }

}
