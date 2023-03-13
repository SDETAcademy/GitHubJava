package day_46;

public class Food {
    public String foodName;
    public String foodOrigin;
    public static String foodCuisine;

    public Food(){
    }

    public Food(String foodName, String foodOrigin, String foodCuisine) {
        this.foodName = foodName;
        this.foodOrigin = foodOrigin;
        Food.foodCuisine = foodCuisine;
    }


    public Food(String foodName, String foodOrigin) {
        this.foodName = foodName;
        this.foodOrigin = foodOrigin;
    }

    public void eat() {
        System.out.println("Eating food " + foodName);
    }

    public static void cook() {
        System.out.println("Cooking food");
    }
}
