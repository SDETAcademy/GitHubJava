package day_42;

public class AlcoholObject {
    public static void main(String[] args) {

        Whiskey whiskey = new Whiskey();
        System.out.println(whiskey.hasAlcohol);
        whiskey.drinking();
        whiskey.sharingTheDrink();
        Alcohol.isAged = true;



        Wine wine = new Wine();
        System.out.println(wine.hasAlcohol);
        wine.drinking();


    }
}
