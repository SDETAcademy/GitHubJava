package day_39;

public class Lunch {
    public String lunchName;
    public String ingredientOne;
    public String ingredientTwo;
    public String ingredientThree;
    public int cookingTemp;
    public int cookingTime;

    public Lunch(){
        System.out.println("No Args Constructor");
    }
    public Lunch(String lunchName, String ingredientOne, String ingredientTwo, String ingredientThree){
        System.out.println("Args Constructor");
        this.lunchName = lunchName;
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.ingredientThree = ingredientThree;
    }

    static{
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }


    public void cook(){
        System.out.println("Cooking my " + lunchName + " for " + cookingTime + " minutes, at " + cookingTemp + " degrees");
    }

    public void preparing(){
        System.out.println("Washing my " + ingredientOne + ", chopping my " + ingredientTwo + " frying my " + ingredientThree);
    }

    public void eating(){
        System.out.println("Eating my " + lunchName);
    }

    public static void main(String[] args) {

        Lunch lunch1 = new Lunch();
        lunch1.preparing();

        Lunch lunch2 = new Lunch("Steak", "Meat", "Butter", "Garlic");
        lunch2.preparing();


    }
}
