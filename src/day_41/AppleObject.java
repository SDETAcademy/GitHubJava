package day_41;

public class AppleObject {
    public static void main(String[] args) {
        Iphone iphone14 = new Iphone();
        System.out.println(iphone14.color);
        System.out.println(iphone14.color);
        iphone14.printParentColor();
        iphone14.setParentColor("Green");
        iphone14.printParentColor();

        iphone14.buy();

        Imac imac = new Imac(false);
        System.out.println(imac.color);
        System.out.println(imac.price);
        System.out.println(imac.hasAppleLogo);

        Imac imac2 = new Imac("Mini", "Black", 1500, false);
        System.out.println(imac2.color);
        System.out.println(imac2.price);
        System.out.println(imac2.hasAppleLogo);

        Ipad ipad = new Ipad("2nd Generation");
        System.out.println(ipad.hasCharger);
        System.out.println(ipad.generation);
        ipad.charger.charge();

        Airpods airpods = new Airpods();
        airpods.buy();
        airpods.repair();
        airpods.sell();
        airpods.test();
        airpods.returnProduct();

//        iphone14.productName = "Pro";
//        iphone14.price = 1400.00;
//        iphone14.hasAppleLogo = true;
//        iphone14.buy();
//
//        Imac mac = new Imac();
//        mac.code();
//        mac.color = "grey";
//
//        Ipad ipad = new Ipad();
//        ipad.color = "pink";
//        ipad.playGames();

        //super. - gives us access to the data and behavior of the parent class
        //super() - gives us access to the constructor of the parent class

        //this. - gives us access to the data and behavior of the current class
        //this() - gives us access to the constructor of the current class



    }
}
