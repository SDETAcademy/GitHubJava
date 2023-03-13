package day_37;

import day_25.IsPalindromeCustomMethod;

public class CreditCardObject {
    public static void main(String[] args) {

        CreditCard chase = new CreditCard(); //object is the instance of the class
        chase.creditCardNumber = 1111222233334444L;
        chase.creditCardCVVCode = 789;
        chase.creditCardName = "Chase Sapphire";


        chase.cancellingThePurchase();
        chase.expired();
        chase.payingForPurchase();

        String str = "civic";
        System.out.println(IsPalindromeCustomMethod.isPalindrome(str));

    }
}
