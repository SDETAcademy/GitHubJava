package day_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LambdaPractice {
    public static void main(String[] args) {

/**
 * create a program that will multiply each element by 20 using lambda
 */
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 64, 6, 8, 76, 451, 3, 68));
        Random random = new Random();
        int num = random.nextInt(101);
        System.out.println(num);
        System.out.println(multiplyBy(myList, num));


    }
    public static ArrayList<Integer> multiplyBy(ArrayList<Integer> list, int num){
      list.replaceAll(n->n*num);
       return list;
    }

}
