package day_27;

public class WrapperIntroduction {
    public static void main(String[] args) {
        String str = "101"; // literal declaration of String. We have stack and heap memory.
                            // Inside of heap memory we have pool of Strings
        String str2 = "101";
        String str3 = new String("101");
        String str4 = new String("101");

        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        int a = Integer.parseInt(str); // 101
        int b = 10;
        System.out.println(a + b);

        Integer c = 15;
        System.out.println(a + b + c);

        Integer d = a; //Autoboxing, converting primitive into Integer(Non-primitive) data type(Object)
        System.out.println(d);
        int f = c; //Unboxing, converting a non primitive(Object data type) into primitive
        System.out.println(f);

        Integer k = new Integer(10);
        Integer l = new Integer(10);
        Integer g = 10;
        Integer h = 10;
        System.out.println(k);

        System.out.println(k==l);
        System.out.println(k.equals(l));
        System.out.println(k==g);
        System.out.println(k.equals(g));
        System.out.println(g==h);



        int x = 10;
        int y = 10;
        System.out.println(x==y);

        Integer z = 20;
        Integer w = 20;
        System.out.println(z==w);

        /**
         * int - Integer
         * boolean - Boolean
         * double - Double
         * char - Character
         * byte - Byte
         * short - Short
         * float - Float
         * long - Long
         */

        boolean isSnowing = false;
        Boolean isRaining =true;

        double num10 = 20.8;
        Double num11 = 25.78;

        char characterOne = 'z';
        Character characterTwo = 'h';

        Short num22 = 8;
        Long num33 = 33l;
        Float num54 = 22.5454f;
        Byte num67 = 14;



    }
}
