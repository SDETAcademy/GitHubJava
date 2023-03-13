package day_45;

public class Whale extends Animal{
    @Override
    public void animalExists(){ // dynamic polymorphism
        System.out.println("The Whale exists");
    }

    public void animalExists(String str){ // static polymorphism
        System.out.println("The Whale exists in the " + str);
    }

    public void eatFish(){
        System.out.println("Whale is eating fish");
    }
}
