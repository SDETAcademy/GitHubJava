package day_39;

public class Employee {


    public Employee(){
        System.out.println("This is a Constructor");
    }

    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 1");
    }

    {
        System.out.println("Instance Block 2");
    }


}
