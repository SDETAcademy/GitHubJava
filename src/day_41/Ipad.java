package day_41;

public class Ipad extends AppleStore {

    public String generation;
    public boolean hasCharger;
    public boolean isRefurbished;


    public Ipad() {
    }

    public Ipad(String generation, boolean hasCharger) {
        this.generation = generation;
        this.hasCharger = hasCharger;
    }

    public Ipad(boolean hasCharger){
        this.hasCharger = hasCharger;
    }

    public Ipad(String generation){
        this(true);
        this.generation = generation;
    }

    // if the name of the variables and arguments are matching we definitely need to have this. keyword
    //Even if the name doesn't match, it's a good practice to still use this.
    public void playGames() {
        System.out.println("Playing games on Ipad");
    }

    public void playingGamesWith() {
        this.playGames();
        System.out.println("More and More");
    }

    Charger charger = new Charger(); // creates Has-A relationship

}
