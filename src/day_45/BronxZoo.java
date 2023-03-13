package day_45;

public class BronxZoo extends Zoo{

    public int numberOfVisitors;

    @Override
    public void feedingAnimals(){
        System.out.println("The Bronx zoo is feeding animals");
    }

    public void underConstruction(){
        System.out.println("The Bronx zoo is under construction");
    }
}
