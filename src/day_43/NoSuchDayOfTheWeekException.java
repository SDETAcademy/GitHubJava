package day_43;

public class NoSuchDayOfTheWeekException extends RuntimeException{
    public NoSuchDayOfTheWeekException(String errorMessage){
        super(errorMessage);
    }
}
