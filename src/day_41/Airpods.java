package day_41;

public class Airpods extends AppleStore {

    @Override
    public void sell() {
        System.out.println("Selling an airpods product..." + price);
    }

    @Override
    public void buy() {
        System.out.println("Buying an airpods product...");
    }

    @Override
    public void repair() {
        System.out.println("Repairing an airpods product...");
    }

    @Override
    public void returnProduct() {
        System.out.println("Returning an airpods product...");
    }

    @Override
    public void test() {
        System.out.println("Testing an airpods product...");
    }
}
