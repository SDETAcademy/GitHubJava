package day_44;

public class IHOP extends Restaurant {
    @Override
    public void open() {
        System.out.println("The IHOP is open");
    }

    @Override
    public void close() {
        System.out.println("The IHOP is closed");
    }

    @Override
    public void serve() {
        System.out.println("The IHOP is serving the community");
    }
}
