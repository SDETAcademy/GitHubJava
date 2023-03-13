package day_20;

import java.util.Arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {

        int num = 10, num2 = 15, num3 = 25, num4 = 50;

        int[] numArr = {10, 15, 25, 50};
        System.out.println(Arrays.toString(numArr));

        String[] stringArray = {"Roman, Mu, Julian", "Mu", "Julian"};
        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray.length);


        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 25;
        arr[3] = 50;

        System.out.println(Arrays.toString(arr));


        String[] strArr = new String[3];
        strArr[0] = "Cornelia";
        strArr[1] = "Maria";
        strArr[2] = "Tatiana";

        System.out.println(Arrays.toString(strArr));


        boolean[] boo  = new boolean[3];

        boo[0] = true;
        boo[1] = false;
        boo[2] = true;


        System.out.println(Arrays.toString(boo));


        char[] charArr = new char[3];
        System.out.println(Arrays.toString(charArr));



        int a = 10;
        int b = 20;
        b = a;


        int[] aArr = {5, 1, 53, 67, 7};

        int[] bArr = {1,1};

        System.out.println(Arrays.toString(aArr));
        System.out.println(aArr.length);
        System.out.println(Arrays.toString(bArr));
        System.out.println(bArr.length);

        bArr = aArr;
        System.out.println(Arrays.toString(aArr));
        System.out.println(aArr.length);
        System.out.println(Arrays.toString(bArr));
        System.out.println(bArr.length);

        int[] zArr = {};
        System.out.println(Arrays.toString(zArr));

        zArr = new int[3];
        zArr[2] = 10;
        System.out.println(Arrays.toString(zArr));



    }
}
