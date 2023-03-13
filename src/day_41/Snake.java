package day_41;

public class Snake extends Animal {
    public String name = "Cobra";

    @Override
    public void say() {
        System.out.println("Snake is saying..." + name);
    }
}
