package day_46;

public class Entertainment {
    public static String entertainmentName;
    public static double entertainmentPrice;

    public Entertainment(){
        System.out.println("No-Args Constructor");
    }


    public void entertainmentCost(){
        System.out.println("To enjoy the " + entertainmentName + " you will need to pay " + entertainmentPrice);
    }

    static{
        System.out.println("Static Block");
        entertainmentName = "Roller Coaster";
        entertainmentPrice = 12.5;
    }

    {
        System.out.println("Initialize Block");
        entertainmentCost();
    }

}
