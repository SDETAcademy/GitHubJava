package day_4;

public class Repetition {
    public static void main(String[] args) {

        int a = 10;
        int b = a + 50;

        int c = 3;
//        System.out.println(c);
        c +=20;
//        System.out.println(c);

        int remainder = a%c;
        // 3 +3 = 6
        // 6 + 3 =9
        //
        System.out.println(remainder);

        //casting
        int var1 = 100;
        double var2 = var1;

        System.out.println(var2);

        long var3 = 78;
        byte va4 = (byte) var3;

        String str = "Soemthing";
        System.out.println(var1 + var2 + str + (var3 + va4));

        String str2 =  "" + var3;
        System.out.println(str2 + va4);









    }
}
