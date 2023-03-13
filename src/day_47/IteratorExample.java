package day_47;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Purple");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Brown");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }

        System.out.println(list);


    }
}
