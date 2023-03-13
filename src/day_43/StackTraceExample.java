package day_43;

import java.util.Arrays;

public class StackTraceExample {
    public static void main(String[] args) {

        String[] arr = {"Hello", "World", "Java", "Python"};

        try {
            System.out.println(arr[10]);
            System.out.println("Print Before Catch");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(arr));
    }
}
