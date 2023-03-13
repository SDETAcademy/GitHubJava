package day_10;

public class IndexIsEvenOrOdd {
    public static void main(String[] args) {

        /**
         * Create a string str. and create a char variable for out character to look for
         * Verify the str is not empty and the character is present.
         *boolean isIndexEven.
         * if index of the character is even number, set isIndexEven variable to true, else - false
         * Print the result.
         */

        String str = "I am from Indoor";
        //            012344556
        char a = 'I';
        int index = str.indexOf(a);
        if (str.isEmpty() || index == -1) {
            System.out.println("Str is empty or the character is not there");
        } else {
            String Judge = "";
            Judge = (index % 2 == 0) ? "True" : "False";
            System.out.println(Judge);
        }

    }
}
