package day_34;

import java.util.Arrays;

public class IntroToStreams {
    public static void main(String[] args) {

        int[] intArr = {1,2,2,3,4,5,6,6,4,4};
        int[] resultArrInt = Arrays.stream(intArr).map(x -> x * x).toArray();//using map() when we need to modify some elements value
        System.out.println(Arrays.toString(resultArrInt));

        int[] intArrTwo = {1,2,2,3,4,5,6,6,4,4};
        int[] intArrTwoResult = Arrays.stream(intArrTwo).distinct().toArray(); // distinct() will only leave unique elements
        System.out.println(Arrays.toString(intArrTwoResult));
        System.out.println(Arrays.toString(intArrTwo));

        int[] intArrThree = {1,2,2,3,4,5,6,6,4,4};
        int[] intArrThreeResult = Arrays.stream(intArrThree).filter(x -> x < 5).toArray(); //filter() will help you to leave the elements that fit your condition requirement
        System.out.println(Arrays.toString(intArrThreeResult));

        double asDouble = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).average().getAsDouble();
        System.out.println(asDouble);

        int asInt = Arrays.stream(new int[]{1, 2, 3, 456, 464, 687, 8, 4, 3, 87}).max().getAsInt();
        System.out.println(asInt);

        int asIntMin = Arrays.stream(new int[]{1, 2, 3, 456, 464, 687, 8, 4, 3, 87}).min().getAsInt();
        System.out.println(asIntMin);



    }
}
