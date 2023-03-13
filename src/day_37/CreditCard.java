package day_37;

public class CreditCard {

    /**
     * Create the variables: creditCardName, creditCardNumber, creditCardCVVCode, creditCardZipCode, chargesInternationalFee
     * Create the methods: payingForPurchase, cancellingThePurchase, expired
     */

    public String creditCardName;
    public long creditCardNumber;
    public int creditCardCVVCode;
    public int creditCardZipCode;
    public boolean chargesInternationalFee;


    public void payingForPurchase(){
        System.out.println("Paying for the purchase with " + creditCardNumber);
    }

    public void cancellingThePurchase(){
        System.out.println("Cancelling my purchase on the card name " + creditCardName);
    }

    public void expired(){
        System.out.println("Your credit card with CVV code " + creditCardCVVCode + " has expired");
    }

    public static void ourFirstStaticMethod(){
        System.out.println("This is our first static method inside of the class");
    }

}
