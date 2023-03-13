package day_43;

public class ThrowsExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        anotherCustomMethod();
        System.out.println("World");

    }

    public static void userWaitsForSecs(int secs) throws InterruptedException {
        Thread.sleep(secs*1000);
    }

    public static void anotherCustomMethod() throws InterruptedException {
        userWaitsForSecs(5);
    }
}
