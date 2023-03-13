package day_7;

public class AlcoholDetector {
    public static void main(String[] args){

        /**
         * Create a program, that will take number of volume as a number, and will determine the type of alcohol
         * <5% of volume - beer
         * <11% of volume - beer or champagne
         * <15% of volume - beer, champagne or wine
         * <16% of volume - beer, champagne, wine or sake
         * <40% of volume - beer, champagne, wine, sake or whiskey
         * >=40% of volume - sambuca
         * Please keep in mind boundary testing and possible invalid inputs
         */


        byte n = 17;
        if(n < 0 || n > 100){
            System.out.println("Invalid input");
        }else if(n >= 0 && n < 5){
            System.out.println("Beer");
        }else if(n >= 5 && n < 11){
            System.out.println("Beer or champagne");
        }else if(n >= 11 && n < 15){
            System.out.println("Beer, champagne or wine");
        }else if(n >= 15 && n < 16){
            System.out.println("Beer, champagne, wine or sake");
        }else if(n >= 16 && n < 40){
            System.out.println("Beer, shampagne, wine, sake or whiskey");
        }else if(n >= 40 && n <= 100){
            System.out.println("Sambuka");
        }


    }
}
