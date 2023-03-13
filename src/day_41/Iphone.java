package day_41;

public class Iphone extends AppleStore{

    public String color = super.color;

    public void printParentColor(){
        System.out.println(super.color);
    }

    public void setParentColor(String colorName){
        super.color = colorName;
    }


    public void call(){
        System.out.println("Calling with Iphone");
    }

    public void buy(){
        super.buy();
        System.out.println("Buying Iphone product...");
    }
}
