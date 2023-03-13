package day_10;

public class NumberOfWordsInSentence {
    public static void main(String[] args){

        /**
         * Create a String str = "Max was going at the maximum speed of 65mph. When speed limit is posted maximum 55mph"
         * Create a program, that will have isUnique boolean variable, String word = max
         * check if str is not empty and if max is present in the str.
         * if max is unique, isUnique - true, else - false.
         */

        String str = "Max was going at the maximum speed of 65mph. When speed limit is posted maximum 55mph";
        boolean isUnique;
        String word = "max";

        if(str.isEmpty()){
            System.out.println("The str is empty");
        }else if(str.indexOf(word)==-1){
            System.out.println("The word " + word + " is not present in str");
        }else{
            int firstIndex = str.indexOf(word);
            int secondIndex = str.lastIndexOf(word);
            isUnique = (firstIndex == secondIndex) ? true : false;
            System.out.println("Is word " + word + " is unique? - " + isUnique);
        }

    }
}
