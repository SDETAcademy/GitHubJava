package day_37;

public class CatObject {
    public static void main(String[] args) {

        Cat Leo = new Cat();
        Leo.name = "Leo";
        Leo.color = "brown taby";
        Leo.age = 1;
        Leo.size = "medium";
        Leo.breed = "domestic";
        System.out.println(Leo.breed);

        Leo.meow();
        Leo.hunt();
        Leo.play();
        Leo.sleep();
    }
}
