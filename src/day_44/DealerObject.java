package day_44;

import static day_44.Dealer.CHEVY_MODEL;

public class DealerObject {
    public static void main(String[] args) {
        BestDealMotors bestDealMotors = new BestDealMotors();
        bestDealMotors.sell();
        bestDealMotors.service();
        bestDealMotors.promotion();
        bestDealMotors.lie();
        bestDealMotors.carWash();
        System.out.println(CHEVY_MODEL.toUpperCase());
        bestDealMotors.germanInventory();

        NotBestSellingDealer notBestSellingDealer = new NotBestSellingDealer();
        notBestSellingDealer.sell();
        notBestSellingDealer.service();
        notBestSellingDealer.promotion();
        notBestSellingDealer.lie();
        notBestSellingDealer.carWash();
    }
}
