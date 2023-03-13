package day_13;

public class WhileLoopWithString {
    public static void main(String[] args) {

        /**
         * Create String str = "Good morning, America and Canada. Today is a great day"
         * Create a while loop, that will count the number of characters(create a variable for the character)
         */

        int count = 0;
        String str = "Good morning, America and Canada. Today is a great day";
        System.out.println(str.length());

        while(count<str.length()){
            count++;
        }
        System.out.println(count);

    }
}
