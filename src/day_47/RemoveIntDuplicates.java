package day_47;

import java.util.*;

public class RemoveIntDuplicates {
    public static void main(String[] args) {
        /**
         * Create a custom method, that will accept List<Integer>. Return a Set<Integer>.
         * - Remove duplicates but also preserve the order of insertion
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,1,2,1,2));
        System.out.println(list);
        System.out.println(uniqueOnly(list));

    }

    public static Set<Integer> uniqueOnly(List<Integer> list){
        return new LinkedHashSet<>(list);
    }
}
