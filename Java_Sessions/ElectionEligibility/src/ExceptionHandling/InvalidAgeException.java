package ExceptionHandling;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(int age){
        System.out.println("Not eligible to vote for age : "+age);
    }
}
