package day_26;

public class MethodInsideOfTheMethod {
    public static void main(String[] args) {

        String str = "civic"; // Civic, "", Civ ic
        System.out.println(isPalindromeCustomMethod(str));
    }

    public static boolean isPalindromeCustomMethod(String strPalindrome) {
        boolean emptyOrBlank = isEmptyOrBlank(strPalindrome);
        String strWithoutSpace = removeSpace(strPalindrome);
        if(emptyOrBlank){
            return false;
        }else{
            strWithoutSpace = strWithoutSpace.toUpperCase();
            for (int i = 0; i < strWithoutSpace.length()/2; i++) {
                if(strWithoutSpace.charAt(i)!=strWithoutSpace.charAt(strWithoutSpace.length()-1-i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEmptyOrBlank(String str){
        if(str.isEmpty() || str.isBlank()){
            return true;
        }
        return false;
    }

    public static String removeSpace(String strWithPossibleSpace){
        return strWithPossibleSpace.replace(" ", "");
    }

}
