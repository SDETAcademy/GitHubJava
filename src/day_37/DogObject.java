package day_37;

public class DogObject {
    public static void main(String[] args) {

        Dog Luna = new Dog(); // creating an object from the Dog() class

        Luna.age = 3;
        Luna.name = "Luna";
        Luna.color = "Grey";
        Luna.size = "Small";// with the heart of a pitbull;
        Luna.breed = "Shih-poo";

        Luna.eat();
        Luna.bark();
        Luna.run();
        Luna.play();

    }
}
