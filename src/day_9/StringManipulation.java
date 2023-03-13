package day_9;

public class StringManipulation {
    public static void main(String[] args){

        String str = "My name is nicolas Cage";

        /**
         * Please verify if the String statement has name Nicolas in there;
         */


        if(str.contains("Nicolas")){
            System.out.println("The name is there");
        }else{
            System.out.println("The name is not there");
        }

        String name = "RoMan";

        String nameTwo = name.toLowerCase();

        String nameThree = name.toUpperCase();

        System.out.println(nameTwo);
        System.out.println(nameThree);

        if(nameTwo.equalsIgnoreCase(name)){
            System.out.println("It's a match");
        }else{
            System.out.println("Name doesn't match");
        }


        String randomString = "Python is not good";
        System.out.println(randomString);
        System.out.println(randomString.length());

        String indexSample = "Cornelia";
        //                    01234567

        System.out.println(indexSample.charAt(0));


        /**
         * Create a String variable with your first and last name in it.
         * Create an int variable name count(Random is optional)
         * Create a switch statement:
         * if count = 0 - print the sentence to lower case
         * if count = 1 - print the sentence to Upper case
         * if count = 2 - print character at index 2
         * if count = 3 - verify if the sentence contains your name
         * if count = 4 - print the length of the sentence
         */

        String fullName = "Nicolas Cage";
        int count = 3;

        switch (count){
            case 0:
                System.out.println(fullName.toLowerCase());
                break;
            case 1:
                System.out.println(fullName.toUpperCase());
                break;
            case 2:
                System.out.println(fullName.charAt(2));
                break;
            case 3:
                if(fullName.contains("Nicolas")){
                    System.out.println("The sentence contains my name");
                }
                break;
            case 4:
                System.out.println(fullName.length());
                break;
            default:
                System.out.println("Invalid input");

        }



    String nana = "Nick";
        System.out.println(nana.endsWith("k"));





    }


}
