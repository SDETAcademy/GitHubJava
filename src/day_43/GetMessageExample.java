package day_43;

public class GetMessageExample {
    public static void main(String[] args) {
        String str = "Java is Fun, Python is Not";


        try {
            System.out.println(str.substring(50));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception is Caught");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("END");

    }
}
