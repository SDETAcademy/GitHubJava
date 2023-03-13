package day_37;

public class CountryObject {
    public static void main(String[] args) {

        Country USA = new Country();
        USA.president = "Joe Biden";
        USA.language = "Spanish";

        System.out.println(USA.capital);
        System.out.println(USA.language);

        USA.electedPresident();
        USA.declareWar();
        USA.addingAnotherLanguage();




    }
}
