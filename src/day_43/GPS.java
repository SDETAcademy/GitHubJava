package day_43;

public class GPS {
    public static void main(String[] args) {
        /**
         * Create a String variable that will have a value either: North, South, West or East
         * Use any conditional statement you would like to print: "Heading " + str
         * Create a custom exception and throw it in case of invalid input from the user with the message of your choice
         */

        String direction = "Easts";
        switch (direction){
            case "North":
                System.out.println("Heading North");
                break;
            case "South":
                System.out.println("Heading South");
                break;
            case "East":
                System.out.println("Heading East");
                break;
            case "West":
                System.out.println("Heading West");
                break;
            default:
                throw new NoSuchDirection("No Such Direction as " + direction);
        }

    }
}
