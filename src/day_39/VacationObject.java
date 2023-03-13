package day_39;

import static day_39.Vacation.endOfVacation;
import static day_39.Vacation.extendVacation;

public class VacationObject {
    public static void main(String[] args) {

        Vacation twentyTwentyTwo = new Vacation();// creating an object

        twentyTwentyTwo.budget = 2000.0; // initializing one by one my non-static(instance variables)
        twentyTwentyTwo.rentalCar = "Toyota Sienna";
        twentyTwentyTwo.dates = "07/10/2022 - 07/20/2022";
        twentyTwentyTwo.destination = "Ocean City, NJ";

        Vacation.ticketPrice = 100.00; //initializing my static variables
        Vacation.isRoundTrip = true;

        twentyTwentyTwo.flying();// calling an instance(non-static) methods
        twentyTwentyTwo.isBudget();
        twentyTwentyTwo.driving();

        endOfVacation();// calling a static methods by statically importing them
        extendVacation();

        Vacation twentyTwentyThree = new Vacation("01/15/2023-01/25/2023", "Tampa, FL",
                "Chrysler Pacifica", 25000, true, 500);

        twentyTwentyThree.driving();
        twentyTwentyThree.isBudget();
        twentyTwentyThree.flying();

        endOfVacation();
        extendVacation();

    }
}
