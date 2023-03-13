package day_39;

public class Animal {

    /**
     * Create 2 static blocks, 2 instance blocks and no-args constructor
     */

    public String animalOne;
    public String animalTwo;

    public Animal(){
        System.out.println("Constructor");
    }

    {
        this.animalOne = "Dog";
        this.animalTwo = "Cat";
        System.out.println(animalOne);
        System.out.println(animalTwo);
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Animal one = new Animal();
        Animal two = new Animal();
    }



}
