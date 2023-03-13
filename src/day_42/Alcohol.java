package day_42;

public class Alcohol {
    /**
     * Create a class called Alcohol.
     * Create few variables and few methods - make 1 variable  final, 1 instance and 1 static
     * Please Create child class named after your favorite alcohol
     * Override the methods from the parent class - please make sure to have at least 1 final method(cannot be overridden)
     * Create another class named after your second favorite alcohol and make it final.
     */


    public String name;
    public static boolean isAged;
    public final boolean hasAlcohol = true;

    public static void alcoholIsAged(){
        System.out.println("Alcohol is aged " + isAged);
    }

    public void drinking(){
        System.out.println("Drinking Alcohol");
    }

    public final void sharingTheDrink(){
        System.out.println("Sharing the drink with a friend");
    }


}
