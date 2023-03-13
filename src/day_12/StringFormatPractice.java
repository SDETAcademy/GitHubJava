package day_12;

public class StringFormatPractice {
    public static void main(String[] args) {



        /**
         * Create a programm that will use String.format.
         * 1. Create a String str = "Today is " - you should be using todays day such as (Monday, Tuesday, etc.)
         * 2. Create a String strTwo = "Today I am ... years old" - use the int for the number of years
         * 3. Create a String strThree = "Today's temperature is ... degrees" - use float for the degree number
         */
        //stackoverflow - the most popular website for any solution you may need

        String str = "Today is %s";
        String day = "Monday";
        System.out.println(String.format(str, day));

        String strTwo = "Today I am %d years old";
        int age = 18;
        System.out.println(String.format(strTwo, age));

        String strThree = "Today's temperature %f degrees";
        float t = 78.8F;
        System.out.println(String.format(strThree, t));







    }
}
