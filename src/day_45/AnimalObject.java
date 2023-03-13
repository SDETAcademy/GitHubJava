package day_45;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Whale();
        Whale whale = new Whale();

        whale.animalExists();
        whale.hunt();
        whale.eatFish();

        animal.animalExists();
        animal.hunt();
        ((Whale) animal).eatFish(); //cast to get access to all child classes
    }
}
