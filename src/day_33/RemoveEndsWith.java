package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEndsWith {
    public static void main(String[] args) {

        /**
         * please remove the element from the list if the element ends with a or n.
         * Please do it both ways, with lambda and by just using list methods
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript", "Pascal", "Kotlin", "C++", "C#", "Scala"));

        ArrayList<String> myList = new ArrayList<>();

        for (String each : list) {
            if(!each.endsWith("n") && !each.endsWith("a")){
                myList.add(each);
            }
        }
        System.out.println(myList);


        list.removeIf(n->n.endsWith("a") || n.endsWith("n"));
        System.out.println(list);

    }
}
