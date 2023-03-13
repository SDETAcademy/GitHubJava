package day_37;

public class Car {

    public String make;
    public String model;
    public String color;
    public int year;
    public boolean hasEngine = true;

    public Car(){}

    public Car(String make, String model){
        this.make = make;
        this.model = model;

    }  public Car(String make, String model, String color, int year, boolean hasEngine){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hasEngine = hasEngine;
    }

    public void run(){
        System.out.println("Your " + make + " " + model + " is now running");
    }

    public void fuel(){
        System.out.println("Your " + make + " " + model + " is now fueling");
    }

    public void park(){
        System.out.println("Your " + make + " " + model + " is now parking");
    }
}
