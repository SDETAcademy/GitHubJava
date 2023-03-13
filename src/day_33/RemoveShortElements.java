package day_33;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveShortElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "car", "dog", "Lime", "lemon", "parrot", "vehicle"));

        list.removeIf(n->n.length()>3);
        list.replaceAll(n->n.toUpperCase());
        System.out.println(list);
    }
}
