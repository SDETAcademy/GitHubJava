package day_5;

public class DifferenceBetweenORAndAND {
    public static void main(String[] args) {

        String city = "Philadelphia";
        String state;


        if(city.equals("NYC") || city.equals("New York")){
            /*
                       true   +   false = true
                       false  +  true = true
                       true  +  true  = true
                       false +  false = false
             */
            state = "NY";
            System.out.println(city + " is located in " + state + " state");
        }else if(city.equals("Philadelphia") && city.equals("The City of Eagles")){
            /*
                        true  + true  = true
                        false + true  = false
                        true  + false = false
                        false + false = false
             */
            state = "PA";
            System.out.println(city + " is located in " + state + " state");
        }


    }
}
