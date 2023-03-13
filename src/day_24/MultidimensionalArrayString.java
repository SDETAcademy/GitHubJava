package day_24;

import java.util.Arrays;

public class MultidimensionalArrayString {
    public static void main(String[] args) {

        String[][] classArray = new String[2][3]; //1st bracket - ROW

        classArray [0][0] = "Maria";
        classArray [0][1] = "Tatsiana";
        classArray [0][2] = "Cornelia";

        classArray [1][0] = "Julian";
        classArray [1][1] = "Mu";
        classArray [1][2] = "Roman";

        System.out.println(Arrays.deepToString(classArray));





    }
}
