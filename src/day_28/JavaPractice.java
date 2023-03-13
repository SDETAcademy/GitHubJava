package day_28;

public class JavaPractice {
    public static void main(String[] args) {

        String strString = "123456"; //["1", "2", "3"....]
        char[] charArray = strString.toCharArray();
        String[] strStringArr = strString.split("");
        char[] charArr = {'1','2','3','4','5','6','5'};
        int[] numArr = {1,2,3,4,5,6};
        int num = 1234565;
        String numStr = "" + num;
        System.out.println(hasDuplicatesUsingUniqueMethod(numStr));
        System.out.println(hasDuplicatesCustomMethod(numArr));
        System.out.println(hasDuplicatesCustomMethod(charArr));
        System.out.println(hasDuplicatesCustomMethod(strStringArr));
        System.out.println(hasDuplicatesUsingUniqueMethod(strStringArr));
        System.out.println(hasDuplicatesUsingUniqueMethod(charArray));


        String str = "123456"; //
        String result = "";//if result does not contain charAt(i) > add it to my result
        String str2 = "123456";// adding only unique values from my str
        //
        //            0123456789
        //       indexOf("1") - 0
        //       lastIndexOf("1") - 0
        System.out.println(hasDuplicatesCustomMethod(str));
        System.out.println(hasDuplicatesUsingIndexes(str));
        System.out.println(hasDuplicatesUsingUniqueMethod(str));


    }

    public static boolean hasDuplicatesCustomMethod(String word) {

        int count = 0;//even if the character is unique, when we use nested loop
        //the count will be at least 1

        //when we check the character in the string we use charAt()
        //when we check the element in the array we use arr[index]

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                return true;// True, False, None - python
                //true, false, null - java
            }
            count = 0;
        }
        return false;
    }

    public static boolean hasDuplicatesCustomMethod(int[] numArr) {

        int count = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                return true;// True, False, None - python
                //true, false, null - java
            }
            count = 0;
        }
        return false;
    }

    public static boolean hasDuplicatesCustomMethod(char[] numArr) {

        int count = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                return true;// True, False, None - python
                //true, false, null - java
            }
            count = 0;
        }
        return false;
    }

    public static boolean hasDuplicatesCustomMethod(String[] numArr) {

        int count = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i].equals(numArr[j])) {
                    count++;
                }
            }
            if (count > 1) {
                return true;// True, False, None - python
                //true, false, null - java
            }
            count = 0;
        }
        return false;
    }


    public static boolean hasDuplicatesUsingIndexes(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicatesUsingUniqueMethod(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        if (str.length() == result.length()) {
            return false;
        }
        return true;
    }


    public static boolean hasDuplicatesUsingUniqueMethod(String[] strArr) {
        String result = "";
//strArr = [1,1,2,3,4,5] - 6
//result = "12345" - 5
        for (int i = 0; i < strArr.length; i++) {
            if (!result.contains(strArr[i])) {
                result += strArr[i];
            }
        }

        if (strArr.length == result.length()) {
            return false;
        }
        return true;
    }

    public static boolean hasDuplicatesUsingUniqueMethod(char[] strArr) {
        String result = "";
//strArr = [1,1,2,3,4,5] - 6
//result = "12345" - 5
        for (int i = 0; i < strArr.length; i++) {
            if (!result.contains("" + strArr[i])) {
                result += strArr[i];
            }
        }

        if (strArr.length == result.length()) {
            return false;
        }
        return true;
    }

}
