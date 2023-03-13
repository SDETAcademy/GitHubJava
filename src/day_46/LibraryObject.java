package day_46;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryObject {
    public static void main(String[] args) {
        Library library = new Wikipedia();
        library.libraryName = "Lincolns Library";
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.libraryName = "Online";
        Wikipedia wikipedia1 = new Wikipedia();
        wikipedia1.libraryName = "OffLine";


        List<Library> list = new ArrayList<>();
        list.add(wikipedia);
        list.add(wikipedia1);
        list.add(library);
        System.out.println(list);

        list.get(0).closed();
        List<Library> offline = list.stream().filter(s -> s.libraryName.equalsIgnoreCase("Offline")).collect(Collectors.toList());
        System.out.println(offline);
        System.out.println(offline.get(0).libraryName);


    }
}
