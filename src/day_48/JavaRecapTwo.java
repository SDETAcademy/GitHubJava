package day_48;

import java.util.*;

public class JavaRecapTwo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,3,4,1));
        int[] arr = {1,1,3,4,1};

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//        int[] resultArr = Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(resultArr));
//
//        List<Integer> resultList = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(resultList);

        int[] resultArr = Arrays.stream(arr).map(n -> n * n).toArray();
        System.out.println(Arrays.toString(resultArr));

//        list.removeIf(n->n>1);
//        System.out.println(list);
        list.replaceAll(x->x*x);
        System.out.println(list);


        String str = "AAABBCCCCCDDEEEEEE";
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str.split("")));// [A,A,A,B,B......E,E,E,E,E,E]
        //{A=3, B=2, ...E=6}
        Map<String, Integer> myMap = new LinkedHashMap<>();

        for (String each : strList) {
            myMap.put(each, Collections.frequency(strList, each));
        }


        System.out.println(myMap);

        for (String eachKey : myMap.keySet()) {
            System.out.println(eachKey);
        }

        for (Integer eachValue : myMap.values()) {
            System.out.println(eachValue);
        }

        for (Map.Entry<String, Integer> eachSet : myMap.entrySet()) {
            System.out.println(eachSet);
        }

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,6,8)); //only unique values, no indexes, order will be
                                                                                    // preserved because we used linkedHashSet
        System.out.println(intList);
        System.out.println(removeDuplicatesMethod(intList));

    }
    public static Set<Integer> removeDuplicatesMethod(List<Integer> list){
        return new LinkedHashSet<>(list);
    }
}
