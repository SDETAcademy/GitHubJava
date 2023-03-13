package day_46;

public class Wikipedia extends Library {
    public String URL;

    @Override
    public void closed(){
        System.out.println("Wikipedia is never closed!");
    }

    public void openSource(){
        System.out.println("Wikipedia is an open source library");
    }

}
