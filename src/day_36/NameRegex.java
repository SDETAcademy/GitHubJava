package day_36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameRegex {
    public static void main(String[] args) {
        /**
         * Mr. Schafer@gmail
         * Mr Smith@gmail
         * Ms Davis@work
         */

        String nameOne = "Mr. Schafer@gmail";
        String nameTwo = "Mr Smith@gmail";
        String nameThree = "Ms Davis@work";

        Pattern pattern = Pattern.compile("M(r|s)\\.? (\\w+)");
        Matcher matcher = pattern.matcher(nameThree);

        matcher.find();

        String actualName = matcher.group(2);
        System.out.println(actualName);



    }
}
