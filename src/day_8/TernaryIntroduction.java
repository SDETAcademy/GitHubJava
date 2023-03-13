package day_8;

public class TernaryIntroduction {
    public static void main(String[] args) {

        int time = 20;
        String result = "";
        if (time > 18) {
            result = "Good Day";
        } else {
            result = "Good Evening";
        }


        result = (time > 18) ? "Good Day" : "Good Evening";







        System.out.println(result);


    }
}
