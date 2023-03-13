package day_9;

public class LengthOfTheWord {
    public static void main(String[] args){

        /**
         * Create 2 String variables and initilize them (Make and Model)
         * if the string make has more characters then string model - print "make is a longer word"
         * otherwise "model is the longer word"
         *
         */

        String make = "Honda";
        String model = "HRV";

        if (make.length() > model.length()) {
            System.out.println("Make is a longer word");
        }else {
            System.out.println("Model is the longer word");
        }

    }
}
