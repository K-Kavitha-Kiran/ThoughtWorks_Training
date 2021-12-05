package ExceptionHandling;

import java.util.Scanner;

public class ElectionEligibility{

    public static void main(String[] args) throws InvalidAgeException{

        int age;
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();

        if (age > 18)
            System.out.println("Eligible to vote");
        else {
            try {
                throw new InvalidAgeException(age);
            }
            catch (InvalidAgeException e) {
                System.out.println("Exception caught");
            }
        }
    }
}
