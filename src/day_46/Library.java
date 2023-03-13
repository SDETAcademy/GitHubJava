package day_46;

public class Library {
    public String libraryName;

    public void printLibraryName(){
        System.out.println("We are reading at the " + libraryName);
    }

    public void closed(){
        System.out.println("The library is closed at 9 PM EST");
    }
}
