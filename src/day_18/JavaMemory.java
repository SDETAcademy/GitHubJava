package day_18;

public class JavaMemory {
    public static void main(String[] args) {


        String str = "Helloo";
        String strTwo = "Hello";

        System.out.print(str.equals(strTwo));
        System.out.print(" ");
        System.out.print(str==strTwo);



        /**
         * IMMUTABLE
         * Java has 2 memories: Heap and Stack
         * Also Heap memory has a special place called String pool
         * Anytime we declare String literaly = we create an object in String pool
         */





    }
}
