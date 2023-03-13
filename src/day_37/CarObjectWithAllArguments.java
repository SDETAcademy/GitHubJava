package day_37;

public class CarObjectWithAllArguments {
    public static void main(String[] args) {

        Car finalCar = new Car("Toyota", "Sienna", "Grey", 2023, true);
        System.out.println(finalCar.hasEngine);
        System.out.println(finalCar.year);
        finalCar.run();
        finalCar.fuel();
        finalCar.park();


    }
}
