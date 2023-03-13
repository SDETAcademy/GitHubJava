package day_7;

public class CarDealershipPractice {
    public static void main(String[] args){

        /**
         * 2 Variables(Make and Model and Price):
         * if Make is not on the list - print "Sorry we don't have this vehicle in stock"
         * if Make = Toyota then:
         *      if Model = "Camry" - print "The price for Toyota Camry is 30000"
         *      if Model = "Corolla" - print "The price for Toyota Camry is 25000"
         *      if the Modal input is incorrect print "Sorry we don't have this Model right now"
         * if Make = BMW:
         *      if Model = "Shark" - print "The price for Toyota Camry is 64000"
         *      if Model = "X5" - print "The price for Toyota Camry is 100000"
         *      if the Modal input is incorrect print "Sorry we don't have this Model right now"
         * if Make = "Mercedes":
         *      if Model = "GLE" - print "The price for Toyota Camry is 100000"
         *      if Model = "TLC" - print "The price for Toyota Camry is 45000"
         *      if the Modal input is incorrect print "Sorry we don't have this Model right now"
         */

        String make = "Mercedes";
        String model = "TLC";
        double price;

        if(make.equals("Toyota")){
            if(model.equals("Camry")){
                price = 30_000;
                System.out.println("The price for Toyota Camry is $" + price);
            }else if(model.equals("Corolla")){
                price = 25_000;
                System.out.println("The price for Toyota Corolla is $" + price);
            }else{
                System.out.println("Sorry we don't have this Model right now");
            }
        }else if(make.equals("BMW")){
            if(model.equals("Shark")){
                price = 64_000;
                System.out.println("The price for BMW Shark is $" + price);
            }else if (model.equals("X5")){
                price = 100_000;
                System.out.println("The price for BMW X5 is $" + price);
            }else{
                System.out.println("Sorry we don't have this Model right now");
            }
        }else if(make.equals("Mercedes")){
            if(model.equals("GLE")){
                price = 100_000;
                System.out.println("The price for Mercedes GLE is $" + price);
            }else if(model.equals("TLC")){
                price = 45_000;
                System.out.println("The price for Mercedes TLC is $" + price);
            }else{
                System.out.println("Sorry we don't have this Model right now");
            }
        }
        else{
            System.out.println("Sorry we don't have this vehicle in stock");
        }


                if(!make.equals("Toyota") && !make.equals("BMW") && !make.equals("Mercedes")){
            System.out.println("Sorry we don't have this vehicle in stock");
        }else{
            System.out.println("This is our vehicle");
        }



    }
}
