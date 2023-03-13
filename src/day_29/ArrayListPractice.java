package day_29;


import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        /**
         * Create a program that will have all your classmates in ArrayList(please add them 1 by 1).
         * Create an st that will hold the gender value;
         * Create an if statement, if str = "male" print only males, if str = "female" print only females
         */

        String gender = "Female";

        ArrayList<String> list = new ArrayList<>();
        list.add("Mu");
        list.add("Julian");
        list.add("Roman");
        list.add("Cornelia");
        list.add("Maria");
        list.add("Tatiana");

        if(gender.equalsIgnoreCase("female")){
            System.out.println(list.get(3));
            System.out.println(list.get(4));
            System.out.println(list.get(5));
        }else{
            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
        }




    }
}
