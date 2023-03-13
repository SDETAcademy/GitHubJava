package day_39;

public class Desert {

    /**
     * Create a few variables, methods, overload the constructor, and use static and instance blocks
     */

    public String desertName;
    public String ingredientOne;
    public String ingredientTwo;
    public String ingredientThree;
    public int cookingTemp;
    public int cookingTime;

    public Desert(){
        System.out.println("No-Args constructor");
    }

    public Desert(String desertName, String ingredientOne, String ingredientTwo, String ingredientThree){
        System.out.println("Args Constructor");
        this.desertName = desertName;
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.ingredientThree = ingredientThree;
    }

    static {
        System.out.println("Static Block. Welcome to our kitchen. We will be preparing the desert today!");
    }

    {
        cookingTime = 120;
        this.cookingTemp = 360;
        System.out.println("Initializer block");
    }

    public void mixIngredients(){
        System.out.println("Mixing " + ingredientOne + ", " + ingredientTwo + ", and " + ingredientThree);
    }

    public void makingDesert(){
        System.out.println("Making " + desertName + " desert");
    }

    public void bakingDesert(){
        System.out.println("Cooking my " + desertName + " at the " + cookingTemp + " for " + cookingTime + " minutes");
    }


    public static void main(String[] args) {
        Desert desert = new Desert();
        desert.mixIngredients();
        desert.makingDesert();
        desert.bakingDesert();

        Desert desert2 = new Desert("Cake", "Flour", "Eggs", "Butter");
        desert2.mixIngredients();
        desert2.makingDesert();
        desert2.bakingDesert();

    }


}
