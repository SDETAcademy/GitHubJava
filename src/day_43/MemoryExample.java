package day_43;

public class MemoryExample {
    public static void main(String[] args) {

        /**
         * call the custom method you created
         * find out the exception it throws
         * handle it without using Throwable or Exception
         */
        try {
            myMethod();
        }catch (Throwable e){ // not recommended to use throwable
            System.out.println("Catching");
        }

        System.out.println("END");


    }
    static int count = 0;
    public static void myMethod(){
        System.out.println(count++);
        myMethod();
    }
}
