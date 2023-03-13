package day_44;

public class OliveGarden extends Restaurant{

    @Override
    public void open(){
        System.out.println("The Olive Garden is open");
    }
    @Override
    public void close(){
        System.out.println("The Olive Garden is closed");
    }
    @Override
    public void serve(){
        System.out.println("The Olive Garden is serving the community");
    }
}
