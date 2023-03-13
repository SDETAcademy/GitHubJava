package day_11;

public class SubStringPractice {
    public static void main(String[] args){


        //sub - part
        String str = "Nicolas Cage";
        String anotherName = "Julian";

        int indexOfSpace = str.indexOf(" ");
        System.out.println(indexOfSpace);
        System.out.println(anotherName + str.substring(indexOfSpace));

        System.out.println(str.substring(indexOfSpace));
        System.out.println(str);// - substring() will not change the str value, use a separate variable if you need permanent change


        String sentence = "Java is Fun";
        //                 012345
        System.out.println(sentence.substring(5));
        System.out.println(sentence.substring(5, 7));


        /**
         * Monday Tuesday and Wednesday
         * print "Tuesday and Wednesday"
         * print "and Wednesday"
         * print "Wednesday"
         * print "Tuesday and"
         */
        String sentencee= "monday tuesday and wednesdayyyyy";

        System.out.println(sentencee.substring(7));
        System.out.println(sentencee.substring(15));
        System.out.println(sentencee.substring(19));
        System.out.println(sentencee.substring(7,18));

    }
}
