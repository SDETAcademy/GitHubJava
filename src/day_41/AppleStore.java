package day_41;

public class AppleStore {
    public String productName;
    public String color;
    public boolean hasAppleLogo;
    public double price = 1000;

    public AppleStore(){
    }

    public AppleStore(String productName, String color, double price){
        this.productName = productName;
        this.color = color;
        this.price = price;
    }

    public AppleStore(String productName, String color){
        this.productName = productName;
        this.color = color;
    }

    public void sell(){
        System.out.println("Selling apple product..." + price);
    }

    public void buy(){
        System.out.println("Buying apple product...");
    }

    public void repair(){
        System.out.println("Repairing apple product...");
    }

    public void returnProduct(){
        System.out.println("Returning apple product...");
    }

    public void test(){
        System.out.println("Testing apple product...");
    }

}
