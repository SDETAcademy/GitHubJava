package day_42;

import day_41.Lexus;

public class VehicleObject {
    public static void main(String[] args) {

        Toyota sienna = new Toyota();
        sienna.sale();
        sienna.year = 2023;
        sienna.fueling();
        sienna.startEngine();

        Toyota highlander = new Toyota();
        highlander.year = 2022;
        highlander.sale();

        Lexus lexus = new Lexus();
        //lexus.fueling(); - will give compile error due to the protected access modifier



    }
}
