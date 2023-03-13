package day_37;

public class CarObject {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.hasEngine);

        myCar.run();
        myCar.park();
        myCar.fuel();

    }
}
