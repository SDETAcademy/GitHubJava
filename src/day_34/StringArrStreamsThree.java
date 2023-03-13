package day_34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringArrStreamsThree {
    public static void main(String[] args) {

        String[] strArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //remove the elements that have even number of characters
        List<String> collect = Arrays.stream(strArr).filter(s -> s.length() % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
