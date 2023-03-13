package day_47;

import java.util.*;

public class CollectionIntroduction {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>(Arrays.asList("Mu", "Julian", "Mu", "Roman", "Julian", "Mu", "Cornelia", "Maria", "Tatsiana", "Maria"));
        Set<String> mySet2 = new LinkedHashSet<>(Arrays.asList("Mu", "Julian", "Mu", "Roman", "Julian", "Mu", "Cornelia", "Maria", "Tatsiana", "Maria"));

        System.out.println(mySet);
        System.out.println(mySet2);


    }

    public static Set<String> uniqueList(List<String> list){
        return new LinkedHashSet<>(list);
    }
}
