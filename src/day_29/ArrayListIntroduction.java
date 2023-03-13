package day_29;

import java.util.ArrayList;

public class ArrayListIntroduction {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();//created an ArrayList
        System.out.println(myList);
        System.out.println(myList.size());//like length for arrays
        myList.add("Tatsiana");// arraylist allows duplicates and keeps the order of insertion
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add("Maria");
        myList.add("Julian");
        myList.add("Cornelia");
        myList.add("Roman");
        myList.add("Mu");
        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        //                           [3] - in arrays
        myList.set(5, "Steven");
        System.out.println(myList.get(5));
        System.out.println(myList);
        myList.add(0,"Max");
        System.out.println(myList);
        myList.add(myList.size()/2, "Kibi" );
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        myList.remove("Kibi");
        System.out.println(myList);
        myList.remove("Kibi");
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);

        ArrayList<Integer> myIntegerList = new ArrayList<>();
        System.out.println(myList.size());
        myIntegerList.add(1);
        System.out.println(myIntegerList);
        myIntegerList.add(10);
        myIntegerList.add(20);
        myIntegerList.add(30);
        System.out.println(myIntegerList);
        myIntegerList.add(0,5);
        System.out.println(myIntegerList);
        myIntegerList.add(50);
        myIntegerList.add(60);
        System.out.println(myIntegerList);
        myIntegerList.remove(5);
        System.out.println(myIntegerList);





    }
}
