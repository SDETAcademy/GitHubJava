package day_12;

public class CellphoneTask {
    public static void main(String[] args) {

        /**
         * Create a variable that will only have 1 characters(Example: "c"). Create another variable called converter.
         * The idea is, that every character in your text, has a corresponding digit on your cell phone
         * (Example: abc - 2, def - 3, ... wxyz - 9). Create a method that will convert the characters into the numbers.
         * Examples:
         * c = 2;
         * p =  7;
         * f = 3;
         * etc.
         */

        char character = 't';
        int converter = 0;

        if(character=='a' || character=='b' || character == 'c'){
            converter = 2;
        } if(character=='d' || character=='e' || character == 'f'){
            converter = 3;
        } if(character=='g' || character=='h' || character == 'i'){
            converter = 4;
        } if(character=='j' || character=='k' || character == 'l'){
            converter = 5;
        } if(character=='m' || character=='n' || character == 'o'){
            converter = 6;
        } if(character=='p' || character=='q' || character == 'r' || character == 's'){
            converter = 7;
        } if(character=='t' || character=='u' || character == 'v'){
            converter = 8;
        } if(character=='w' || character=='x' || character == 'y' || character == 'z'){
            converter = 9;
        }
        System.out.println(converter);





    }
}
