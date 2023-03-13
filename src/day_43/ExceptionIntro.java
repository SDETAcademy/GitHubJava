package day_43;

public class ExceptionIntro {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        int num = 0;
        int a;

        try{
            a = 50/50;
        }
        catch (ArithmeticException e){
            System.out.println("Catching ArithmeticException Exception");
            a = 50/10;
        }
        finally {
            System.out.println("Executing Finally");
        }
        System.out.println("Hello Nick");
        System.out.println(a);



    }
}
