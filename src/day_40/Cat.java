package day_40;

public class Cat extends Animal{

    public Cat(){
        System.out.println("Creating a cat no args");
    }

    public Cat(String str){
        super("Simba");
        System.out.println("Creating a cat with args " + str);
        //super(); - compile error. Super has to be the first statement
    }

    public String color = "black";

    public void meow(){
        System.out.println("cat says meow...");
    }

    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    public void eat(){
        System.out.println("eating... as a cat");
        super.eat();
    }
}


// super. - access variables and methods from the parent class or super class
// super() - access parent constructor
//this. - access current class variables and methods
//this() - access current constructor