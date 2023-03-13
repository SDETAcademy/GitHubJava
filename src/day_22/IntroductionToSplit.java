package day_22;

import java.util.Arrays;

public class IntroductionToSplit {
    public static void main(String[] args) {

        String str = "Java is fun and python is not"; //[Java, is, fun, and, python, us, not]

//        String strArr[] = {"Java", "is", "fun", "python", "is", "not"};

        String[] strArr = str.split(" "); // delimiter; return type is String[]
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);

        int num = 1454423526; //[1, 4 , 5 .... , 6]
        String numString = "" + num;

        String[] split = numString.split("");
        System.out.println(Arrays.toString(split));

        int[] numArr = {1, 4, 5, 4, 4, 2, 3, 5, 2, 6};
        System.out.println(Arrays.toString(numArr));


        System.out.println(split[0] + split[1]);
        System.out.println(String.valueOf(numArr[0]) + String.valueOf(numArr[1]));

        //String valueOf(int num) - will turn your number into a String


    }
}
