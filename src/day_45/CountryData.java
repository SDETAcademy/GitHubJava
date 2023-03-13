package day_45;

public interface CountryData {
    String CAPITAL = "Washington D.C."; // public static final be default
    int NUMBER_OF_STATES = 50;
    void countryCapital();
    default void printAnything(){
        System.out.println("Printing anything");
    }
    static void printSomething(){
        System.out.println("Printing something");
    }
}
