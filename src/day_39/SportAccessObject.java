package day_39;

public class SportAccessObject {
    public static void main(String[] args) {
        SportAccess sportOne = new SportAccess();

        sportOne.sportName = "Football";
        sportOne.athleteName = "L. Messi";
        sportOne.athleteNumber = 10;

        sportOne.printSportName();
        sportOne.printAthleteName();
        sportOne.printAthleteNumber();


    }
}
