package day_12;

public class ReplaceAllPractice {
    public static void main(String[] args) {

//    String str = "My name is {myName}, and my father name is {fatherName}, and my mother name is {motherName}";
    //replace all will accept String, and another argument - REGEX - regular expression

//        String myName = "Nick";
//        String fatherName = "George";
//        String motherName = "Nancy";
//        String result = str.replaceAll("\\{myName}", myName).replaceAll("\\{fatherName}", fatherName)
//                .replaceAll("\\{motherName}", motherName);
//        System.out.println(result);

/**
 * Create an String str = "I live in [city] in [state] state in the [country] country"
 * Use replace all method to put the proper values for City, State and Country.
 */
        String str ="I live in {city} in {state} state in the {country} country";
        String city = " Philadelphia";
        String state = "Pennsylvania";
        String country = "USA";
        String result = str.replaceAll( "\\{city}", city).replaceAll("\\{state}", state).
                replaceAll("\\{country}", country);
        System.out.println(result);

    }
}
