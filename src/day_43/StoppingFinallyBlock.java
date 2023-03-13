package day_43;

public class StoppingFinallyBlock {
    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Handling NullPointer");
            System.exit(1); // will stop the JVM from continuing the execution(end the session)
        }catch (ArithmeticException e){
            //do nothing
        }
        finally {
            System.out.println("Finally Block");
        }


        try{
            System.out.println(str.substring(10));
        }
        finally{
            System.out.println("Hello");
        }
        System.out.println("END");
    }
}
