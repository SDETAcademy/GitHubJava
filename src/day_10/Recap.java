package day_10;

public class Recap {
    public static void main(String[] args) {

        /**
         *  ALL OF THESE ARE APPLICABLE TO STRING
         *  equals() - boolean
         *  contains() - boolean
         *  equalsIgnoreCase() - boolean
         *  length() - int
         *  toUpperCase() - String - we don't change the value for the variable
         *  toLowerCase() - String - we don't change the value for the variable
         *  isEmpty() - boolean
         *  chartAt() - char - use "" if you need to convert char to String
         *  indexOf() - int
         *  lastIndexOf() - int
         *  startsWith() - boolean
         *  endsWith() - boolean
         *  Length calculation goes 1,2,3,.....
         *  Index calculation goes 0,1,2,3,4
         *  length -1 - will always give you an index for the very last character
         *  if we are trying to find out an index of the character or String that is not in the sentence - the index will be -1
         */

        String name = "{player1} and {player2} are the best dudes";

        String nameTwo = name.replaceAll("\\{player1}", "Max");

        String someting = "The time is %d";
        String modified = String.format(someting, 4);
        System.out.println(modified);

        System.out.println(nameTwo);





    }
}
