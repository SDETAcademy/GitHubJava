package day_44;

public class BestDealMotors implements Dealer, DealerTwo{
    @Override
    public void sell() {
        System.out.println("Selling the " + GMC_MODEL);
    }

    @Override
    public void service() {
        System.out.println("Servicing " + FORD_MODEL);
    }

    @Override
    public void promotion() {
        System.out.println("Promoting " + CHEVY_MODEL);
    }

    @Override
    public void lie() {
        System.out.println("Lie to my customers to sell my overpriced vehicles");
    }

    @Override
    public void carWash() {
        System.out.println("I sell my car wash for $2,000");
    }

    @Override
    public void germanInventory() {
        System.out.println("We have " + MERCEDES_MODEL + ", " + AUDI_MODEL + ", " + BMW);
    }
}
