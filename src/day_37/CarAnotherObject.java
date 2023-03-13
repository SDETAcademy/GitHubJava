package day_37;

public class CarAnotherObject {
    public static void main(String[] args) {

        Car anotherCar = new Car("Lexus", "GX470");
        System.out.println(anotherCar.hasEngine);
        anotherCar.year = 2005;
        anotherCar.color = "Grey";
        System.out.println(anotherCar.year);
        System.out.println(anotherCar.color);

        anotherCar.run();



    }
}
