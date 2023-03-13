package day_36;

import java.util.Arrays;

public class InterviewRegex {
    public static void main(String[] args) {

        String word= "DC501GCCCA989115GS3453GDSSG";// 501 + 98911
        String[] regexArr = word.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        System.out.println(Arrays.toString(regexArr));


    }
}
