package day_26;

public class CallingMultipleMethodsInsideOneMethod {
    public static void main(String[] args) {

        animal("dog");

    }

    public static void animal(String animalType){
        System.out.println("Our animal is " + animalType);
        System.out.println("Our animal " + actionMethod(animalType));
        boolean tailPresent = hasTail(animalType);
        System.out.println("Our animal has tail? " + tailPresent);
    }

    public static String actionMethod(String animalType){

        if (animalType.equals("cat")){
            return "meows meows";
        }else if(animalType.equals("dog")){
            return "woof woof";
        }else{
            return "invalid input";
        }
    }

    public static boolean hasTail(String animalType){
        if(animalType.equals("dog") || animalType.equals("cat")){
            return true;
        }else{
            return false;
        }
    }

}
