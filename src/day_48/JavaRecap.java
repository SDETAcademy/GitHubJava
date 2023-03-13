package day_48;

import java.util.Arrays;


public final class JavaRecap {
    public static void main(String[] args) {

        int[] arr = {1, 23, 34, 64, 64, 41, 2};
        System.out.println(Arrays.toString(sortArrayCustomMethod(arr)));

        System.out.println(sortArrayCustomMethod(arr)[arr.length - 1]);

        JavaRecap javaRecap = new JavaRecap();
        System.out.println(Arrays.toString(javaRecap.sortArrayInstanceMethod(arr)));

    }

    public static final int[] sortArrayCustomMethod(int[] arr) {
        int[] resultArr = arr;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // change the < to > to sort in the descending order
                    temp = resultArr[i];
                    resultArr[i] = resultArr[j];
                    resultArr[j] = temp;
                }
            }
        }
        return resultArr;
    }

    public final int[] sortArrayInstanceMethod(int[] arr) {
        int[] resultArr = arr;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // change the < to > to sort in the descending order
                    temp = resultArr[i];
                    resultArr[i] = resultArr[j];
                    resultArr[j] = temp;
                }
            }
        }
        return resultArr;
    }
}
