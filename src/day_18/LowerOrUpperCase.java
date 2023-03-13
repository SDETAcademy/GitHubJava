package day_18;

public class LowerOrUpperCase {
    public static void main(String[] args) {

        String character2 = "A";
        String copy = character2.toLowerCase(); // a

        System.out.println(character2);
        System.out.println(copy);
        System.out.println(character2.equals(copy));


        char character = ']';

        for (int i = 'a'; i<='z'; i++ ){

            if(i==character){
                System.out.println("The " + character + " character is lower case");
                break;
            }
        }



        for (int i = 'A'; i<='Z'; i++ ){

            if(i==character){
                System.out.println("The " + character + " character is UPPER case");
                break;
            }
        }

        for (int i = ' '; i<=127; i++ ){

            if(i==character){
                System.out.println("The " + character + " is not a letter");
                break;
            }
        }


    }
}
