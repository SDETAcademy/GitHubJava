package day_41;

public class Imac extends AppleStore{

    public Imac(){
    }

    public Imac(boolean hasAppleLogo){
        super("Pro", "Blue", 1000.0);
    }

    public Imac(String productName, String color, double price, boolean hasAppleLogo ){
        super.productName = productName;
        super.color = color;
        super.price = price;
        super.hasAppleLogo = hasAppleLogo;
    }

    public Imac(String productName, String color, double price){
        super(productName, color);
        super.price = price;
    }

    public void code(){
        System.out.println("Coding on my Mac");
    }
}
