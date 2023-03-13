package day_45;

import static day_45.CountryData.NUMBER_OF_STATES;

public class CountryObject {
    public static void main(String[] args) {
        UnitedStates unitedStates = new UnitedStates();
        unitedStates.countryName();
        unitedStates.countryPopulation();
        unitedStates.countryCurrency();
        unitedStates.countryLanguage();
        unitedStates.countryCapital();
        System.out.println("United states has a total of " + NUMBER_OF_STATES + " states");
        unitedStates.printAnything();
        CountryData.printSomething();
        System.out.println(unitedStates.number()); //method hiding will prioritize the method that lives in the class
                                                   //object of which we have created.

        System.out.println(UnitedStates.number());
        System.out.println(Country.number()); //this method will be hidden by java
    }
}
