package day_37;

import day_25.IsPalindromeCustomMethod;
import day_33.CallingMethodsInLambdas;

public class AccessingStaticMethod {
    public static void main(String[] args) {

        CreditCard discover = new CreditCard();
        discover.ourFirstStaticMethod(); // very bad practice, do not do this!
        CreditCard.ourFirstStaticMethod();// we access static methods via the name of the class where they live in.

        String str = "civic";
        System.out.println(IsPalindromeCustomMethod.isPalindrome(str));

        CreditCard creditCard = new CreditCard();


        creditCard.creditCardName = "Tatsiana Card";
        String myCard = CallingMethodsInLambdas.reverseStr(creditCard.creditCardName);
        System.out.println(myCard);


    }
}
