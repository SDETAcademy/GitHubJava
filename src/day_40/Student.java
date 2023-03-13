package day_40;

public class Student {
    public String name;
    public int age;

    public Student(){
        this.name = "Tatsiana";
        System.out.println("No Args constructor");
    }

    public Student(int age){
        this();
        this.age = age;
        System.out.println("Args constructor");
        //this() - wi;; give us compile error. Needs to be the first statement inside the constructor
    }



//    public Student(String n, int a){ - will work without this. keyword
//        name = n;
//        age = a;
//    }
    public Student(String name, int age){ // will work and is the best practice to follow
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("name " + name + " age "+ age);
    }

    public void callDisplay(){
        display();
    }

}
