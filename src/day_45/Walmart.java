package day_45;

public class Walmart extends Store{

    String location; // Trenton
    @Override
    public void discountAvailable(){
        System.out.println("Discount is available at Walmart");
    }

    public void storeClosed(String location){
        this.location = location;
        System.out.println("Walmart is closed at location " + location);
    }
    public void storeClosed(){
        System.out.println("Walmart is closed at location " + location);
    }
}
