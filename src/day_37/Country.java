package day_37;

public class Country {

    /**
     * Create the following variables:
     * - Country capital
     * - President
     * - Language
     * - isMonarchy
     * - hasMilitary
     * - Currency
     * Create the following methods:
     * - electedPresident
     * - addingAnotherLanguage
     * - declareAWar
     */

    public String capital;
    public String president;
    public String language = "English";
    public boolean isMonarchy;
    public boolean hasMilitary;
    public String currency;

    public void electedPresident(){
        System.out.println(president + " is the president in our country");
    }

    public void addingAnotherLanguage(){
        System.out.println("We are not adding another language");
    }

    public void declareWar(){
        System.out.println(president + " has the power to declare a war");
    }


}
