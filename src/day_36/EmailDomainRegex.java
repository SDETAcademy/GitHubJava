package day_36;

public class EmailDomainRegex {
    public static void main(String[] args) {

        String email = "https://www.google.com";
        String emailTwo = "http://coreyms.edu";
        String emailThree = "https://youtube.com";
        String emailFour = "https://www.nasa.gov";
        String result = email.replaceAll("(https?://)(www\\.)?", "");
        String resultTwo = emailTwo.replaceAll("(https?://)(www\\.)?", "");
        String resultThree = emailThree.replaceAll("(https?://)(www\\.)?", "");
        String resultFour = emailFour.replaceAll("(https?://)(www\\.)?", "");
        System.out.println(result);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);


    }
}
