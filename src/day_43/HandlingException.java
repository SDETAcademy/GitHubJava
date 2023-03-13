package day_43;

public class HandlingException {
    public static void main(String[] args) {
        /**
         * Declare and initialize String variable
         * Try to print charAt(20);
         * Please Use Try/catch block to handle any possible exceptions
         */

        String str = "HelloHelloHelloHelloHelloHelloHelloHello";
        int a;

        try {
//            System.out.println(str.charAt(20));
            a = 50 / 25;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Catching Arithmetical Exception");
        }finally {
            //do nothing
        }
//        catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Catching my String Exception");
//        }

        System.out.println("Continue with my code");

    }
}
