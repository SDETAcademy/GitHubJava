package day_44;

public class BankObject {
    public static void main(String[] args) {
        Chase chase = new Chase();
        PNC pnc = new PNC();
        BankOfAmerica bankOfAmerica = new BankOfAmerica();

        System.out.println(chase.rateOfInterest());
        System.out.println(pnc.rateOfInterest());
        System.out.println(bankOfAmerica.rateOfInterest());
    }
}
