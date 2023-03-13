package day_26;

public class MethodOverloading {
    public static void main(String[] args) {

        /**
         * Method overloading was created to make the code more reusable, more dynamic, save some memory and make the code
         * more readable.
         * With method overloading, the name of the method has to be the same but the signature has to be different somehow:
         * - The order of parameters
         * - data type of parameters
         * - number of parameters
         */

        int x = 10;
        int y = 20;
        double w = 15.5;
        double z = 25.3;
        double p = 100.4;
        String str = "Hello World";

        System.out.println(additionSum(x, y));
        System.out.println(additionSum(w,z,p));
        System.out.println(additionSum(w,z,p,str));
        System.out.println(additionSum(str, w, z, p));
        System.out.println(additionSum(str, w, z, p));


    }

    public static int additionSum(int a, int b){ //method signature
        int sum = a + b;
        return sum;
    }

    public static double additionSum(double a, double b){
        double sum = a+b;
        return sum;
    }

    public static double additionSum(double a, double b, double c){
        double sum = a+b+c;
        return sum;
    }

    public static double additionSum(double a, double b, double c, String str){
        double sum = a+b+c;
        System.out.println("the str is " + str);
        return sum;
    }

    public static double additionSum(String str, double a, double b, double c){
        double sum = a+b+c;
        System.out.println("the str is " + str);
        return sum;
    }


}
