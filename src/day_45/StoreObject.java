package day_45;

public class StoreObject {
    public static void main(String[] args) {
//        Walmart walmart = new Walmart();
//        Store store = walmart; //Upcasting, done implicitly so no action required

        Store store1 = new Walmart();
        Walmart walmart1 = (Walmart) store1; // Downcasting, requires you to manually implement it

//        store.discountAvailable();
//        store.printPrice();
//        ((Walmart) store).storeClosed("Allentown");

//        walmart.discountAvailable();
//        walmart.storeClosed("Philadelphia");
//        walmart.printPrice();


//        store1.printPrice();
//        store1.discountAvailable();
        ((Walmart) store1).storeClosed("Trenton");
        System.out.println(((Walmart) store1).location);
//        walmart1.printPrice();
        walmart1.storeClosed();
        System.out.println(walmart1.location);

        double a = 666;
        int b = (int) a;

    }
}
