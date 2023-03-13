package day_30;

import java.util.ArrayList;

public class ArrayPracticeTaskTwo {
    public static void main(String[] args) {

        /**
         * Create an ArrayList with values: 0,1,2,3,4,5,6,7,8,9,10
         * 1.print the entire list
         * 2. print only odd numbers
         * 3. remove even numbers
         * 4. print the entire list again
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
//
//        System.out.println(list.get(1));
//        System.out.println(list.get(3));
//        System.out.println(list.get(5));
//        System.out.println(list.get(7));
//        System.out.println(list.get(9));
        //        for (int i = 1; i < list.size(); i+=2) {
//            System.out.println(list.get(i));
//        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                System.out.println(list.get(i));
            }
        }

        list.remove(0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);


//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)%2==0){
//                list.remove(list.get(i));
//                System.out.println(list);
//                i=-1;
//            }
//        }


    }
}

