package day_46;


import java.util.ArrayList;
import java.util.List;

public class FoodObject {
    public static void main(String[] args) {
        Food shrimpCocktail = new Food("Shrimp Cocktail", "Greece", "Greek");
        Food sushi = new Food("Sushi", "Japanese");
        Food scallops = new Food("Grilled Scallops", "Spain");

        List<Food> list = new ArrayList<>();
        list.add(shrimpCocktail);
        list.add(sushi);
        list.add(scallops);

        for (Food each : list) {
            System.out.println(each.foodName);
            System.out.println("*******************");
            System.out.println(each.foodOrigin);
            System.out.println("*******************");
            each.eat();
            System.out.println("*******************");
            System.out.println();
        }

    }
}
