package day_42;

public class Vehicle {

    public String engine;
    public String make;
    public String model;
    public int year;
    public double price;
    public boolean isRunning;
    public boolean hasWarranty;

    public static final boolean HAS_WHEELS = true;

    private String question;


    public void buy(){
//        System.out.println("Buying a vehicle");
    }

    void startEngine(){
        System.out.println("Starting engine");
    }

    protected void fueling(){
        System.out.println("Fueling");
    }

    public void sale(){
        System.out.println("Vehicle is on sale!");
    }

    public void printWheels(){
        System.out.println(HAS_WHEELS);
    }
}
