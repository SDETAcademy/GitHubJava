package day_10;

public class MoreStringMethods {
    public static void main(String[] args) {

        /**
         * startsWith() - applied to String and the return type is boolean
         * endsWith() - applied to String and the return type is boolean
         */

        String carMake = "Lexus";
        String comparing = "l";
        String anotherComparing = comparing.toUpperCase();

        System.out.println(carMake.startsWith(comparing.toUpperCase())); // L
        System.out.println(carMake.startsWith(anotherComparing));

        System.out.println(carMake.endsWith("s"));


    }
}
