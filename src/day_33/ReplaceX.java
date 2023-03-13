package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceX {
    public static void main(String[] args) {

        /**
         * Given a list of strings, return a list where each string has all its "x" removed.
         *
         *
         * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
         * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("ax", "bb", "cx"));
        // list.replaceAll(n -> n.replace("x", ""));
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace("x", ""));
        }
        System.out.println(list);
    }


}

