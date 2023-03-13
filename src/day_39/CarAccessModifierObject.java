package day_39;

public class CarAccessModifierObject {
    public static void main(String[] args) {
        CarAccessModifier carOne = new CarAccessModifier();
        carOne.odometer = 90000;
        carOne.make = "Lexus";
        carOne.model = "RX300";
        carOne.printOdometer();
        carOne.printMake();
        carOne.printModel();

    }
}
