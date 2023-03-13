package day_10;

public class StringManipulationRepetition {
    public static void main(String[] args){

        /**
         * String - non primitive(array of chars)
         * equals() - exact match, otherwise the condition will be false
         * Other String methods:
         * length() - applied to String and returns an int(number)
         * contains() - applied to String and returns a boolean
         * charAt() - applied to String and the return type is char
         * toLowerCase() - applied to String and return type is String - does not change the initial value
         * toUpperCase() - applied to String and return type is String - does not change the initial value
         * equalsIgnoreCase() - applied to String and return type is boolean
         *
         * Every method in Java has a return type.
         */


        String name = "Nick";
        int length = name.length();

        System.out.println(length);

        String containsExample = "Nicolas2 Cage";

        if(containsExample.contains("2")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        System.out.println(containsExample.contains("2"));


        String charExample = "This is an example";

        char example = charExample.charAt(5);
        String exampleString = String.valueOf(example);
        String exampleThree = "" + charExample.charAt(5);
        System.out.println(exampleThree);


        System.out.println(charExample.charAt(5));

        String lowerCaseExample = "TATIANA";
        String toLowerCasePlease = lowerCaseExample.toLowerCase();
        System.out.println(toLowerCasePlease);

        String upperCaseExample = "taTiAna";
        String toUpperCasePlease = upperCaseExample.toUpperCase();
        System.out.println(toUpperCasePlease);


        String dogOne = "Rex"; //rex or REX
        String dogTwo = "reX"; //rex or REX
        String dogThree = dogOne.toLowerCase();

        System.out.println(dogOne);
        System.out.println(dogOne.toLowerCase());
        System.out.println(dogOne);


//
        System.out.println(dogOne.equalsIgnoreCase(dogTwo));
//
//        System.out.println(dogOne.contains(dogTwo));
//
//        System.out.println(dogOne.toLowerCase().equals(dogTwo.toLowerCase()));
//        System.out.println(dogOne);



        String catName = "Margaret"; // 8
        //                01234567 - the last index number is ALWAYS going to be length-1
        System.out.println(catName.length());
        System.out.println(catName.charAt(4));
       // System.out.println(catName.charAt(10)); // - index out of bound exception






    }
}
