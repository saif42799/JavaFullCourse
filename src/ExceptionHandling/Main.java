package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println(z);
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide by zero idiot");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        catch (Exception e ){
            System.out.println("Something went wrong");

        }
        finally {
            System.out.println("This will always print ");
            scanner.close();

        }

    }
}
