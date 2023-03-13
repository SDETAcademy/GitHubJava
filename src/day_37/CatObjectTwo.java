package day_37;

public class CatObjectTwo {
    public static void main(String[] args) {

        Cat Kit = new Cat();

        Kit.name = "Simba";
        Kit.size = "medium";
        Kit.age = 3;
        Kit.color = "Orange";
        Kit.breed = "Persian";

        Kit.sleep();
        Kit.hunt();
        Kit.meow();
        Kit.play();
    }
}
