package day_14;

public class DoWhileLoopCountCharacters {
    public static void main(String[] args) {

        /**
         * Given str , please count the number of characters. Do not use str.length();
         */

        String str = "Hello world!";
        int count = 0;
        do{
            count++;
        }
        while(count < str.length());
        System.out.println(count);




    }
}
