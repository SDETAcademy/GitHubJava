package day_30;

import java.util.ArrayList;

public class ArrayListColors {
    public static void main(String[] args) {

        /**
         * Create an ARRAYLIST!!! that will have the following values:
         * black, brown, white, purple, red, green, blue, yellow
         * 1. Add an element with the value gold and make it the very first element in your ArrayList
         * 2. delete the element with value yellow
         * 3. make your element with value red = ToUpperCase = RED
         * 4. replace your white with very white
         * Note: Please make sure you print your entire list after every action.
         */

        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("brown");
        colors.add("white");
        colors.add("purple");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        colors.add(0,"gold");
        System.out.println(colors);
        colors.remove("yellow");
        System.out.println(colors);
        colors.set(5, colors.get(5).toUpperCase());
        System.out.println(colors);
        colors.set(3,"very white");
        System.out.println(colors);

    }
}

