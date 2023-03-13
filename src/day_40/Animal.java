package day_40;

public class Animal {

    public Animal(){
        System.out.println("Animal is create no args");
    }
    public Animal(String str){
        System.out.println("Animal is created " + str);
    }

    public String color = "white";

    public void eat(){
        System.out.println("eating... as a animal");
    }
}
