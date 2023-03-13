package day_45;

public class ZooObject {
    public static void main(String[] args) {
        Zoo zoo = new BronxZoo();
        BronxZoo bronxZoo = (BronxZoo) zoo; // downcasting

        zoo.season = "Fall";

        bronxZoo.feedingAnimals();
        bronxZoo.openForPublic();
        bronxZoo.underConstruction();
        System.out.println(bronxZoo.season);


    }
}
