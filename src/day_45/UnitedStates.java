package day_45;

public class UnitedStates extends Country implements CountryData{
    @Override
    public void countryName() {
        System.out.println("Our country is the United States of America");
    }

    @Override
    public void countryPopulation() {
        System.out.println("The population of the USA is 330 million people");
    }

    @Override
    public void countryCurrency() {
        System.out.println("The US official currency is - Dollar");
    }

    @Override
    public void countryLanguage(){
        System.out.println("We speak English");
    }

    @Override
    public void countryCapital() {
        System.out.println("The capital of our country is " + CAPITAL);
    }

    public static int number(){
        return 25;
    }
}
