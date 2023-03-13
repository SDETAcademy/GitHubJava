package day_36;

public class CreditCardRegex {
    public static void main(String[] args) {
        String creditCard = "1111-2222-3333-4567"; //XXXX-XXXX-XXXX-4567
        String maskedCreditCard = creditCard.replaceAll("\\d{4}-\\d{4}-\\d{4}-", "XXXX-XXXX-XXXX-");
        System.out.println(maskedCreditCard);


    }
}
