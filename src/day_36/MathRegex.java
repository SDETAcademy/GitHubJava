package day_36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathRegex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(\\d+)( \\w+ \\w+ )(\\d+)");
        Matcher matcher = pattern.matcher("100 divided by 20");
/**
 *  index 0 - will print the entire matcher
 *  index 1 - will print group 1
 *  index 2 - will print group 2
 *  index 3 - will print group 3
 */
        int result = 0;

        matcher.find();

        if(matcher.group(2).contains("divided")) {
            result = Integer.parseInt(matcher.group(1)) / Integer.parseInt(matcher.group(3));
        }else if(matcher.group(2).contains("multiply")){
            result = Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3));
        }else if(matcher.group(2).contains("minus")){
            result = Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3));
        }else if(matcher.group(2).contains("plus")){
            result = Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3));
        }else if (matcher.group(2).contains("remainder")){
            result = Integer.parseInt(matcher.group(1)) % Integer.parseInt(matcher.group(3));
        }

        System.out.println(result);

    }
}
