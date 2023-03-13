package day_34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringArrayStreams {
    public static void main(String[] args) {

        String[] strArr = {"Java", "java", "Python", "python"};
        List<String> collect = Arrays.stream(strArr)
                .map(s -> s.replace("a", "z")
                .replace("th", "o"))
                .collect(Collectors.toList());
        System.out.println(collect);

        String[] strArrTwo = {"J av a", "ja va", "Pyt hon", "pyt Hon"}; // [java, python]
        List<String> collect1 = Arrays.stream(strArrTwo).map(s -> s.replace(" ", "").toLowerCase())
                .distinct().collect(Collectors.toList());
        System.out.println(collect1);


    }
}
