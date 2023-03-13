package day_42;

public class Toyota extends Vehicle{
    @Override
    public void buy() {
        System.out.println("Buying a Toyota");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting my Toyota");
    }

    @Override
    public void fueling() {
        System.out.println("Fueling my Toyota");
    }

    @Override
    public void sale() {
        System.out.println("Toyota Sienna is on sale");
    }
}
