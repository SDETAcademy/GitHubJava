package day_16;


public class Quiz {
    public static void main(String[] args) {
        String word = "Java is fun!";
        for (int i=1; i< word.length(); i++) {
            System.out.println(i+ ") " + word.charAt(i-1));
        }
    }
}
