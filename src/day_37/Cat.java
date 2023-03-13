package day_37;

public class Cat {

    public int age;
    public String name;
    public String breed = "Bald";
    public String color;
    public String size;

    public Cat(){}

    public Cat(int age){
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void hunt(){
        System.out.println(name + " is hunting for a mice");
    }

    public void sleep(){
        System.out.println(name + " is asleep and resting");
    }

    public void meow(){
        System.out.println(name + " says MEOW");
    }

    public void play(){
        System.out.println(name + " is playing with a toy");
    }



}
