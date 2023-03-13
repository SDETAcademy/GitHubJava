package day_39;

public class CarAccessModifier {

    private int year;
    public int odometer;
    protected String make;
    String model;

    private void printYear(){
        System.out.println(year);
    }

    public void printOdometer(){
        System.out.println(odometer);
    }

    protected void printMake(){
        System.out.println(make);
    }

    void printModel(){
        System.out.println(model);
    }
}
