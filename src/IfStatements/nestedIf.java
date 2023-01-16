package IfStatements;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();



        if (number > 0 && number < 20){
            System.out.println("Your number is: " + number);
            if (number == 13){
                System.out.println("Round two!");
                System.out.println("You found the special number");
            }
        }
        else if (number > 21 && number < 50){
            System.out.println("Your number is: " + number);
            if (number == 31){
                System.out.println("Wah, Wah, Wah, You lost");
            }
        }
        else if (number > 51 && number < 100){
            System.out.println("Your number is: " + number);
            if (number == 81){
                System.out.println("You found a high number");
            }
        }
        else {
            System.out.println("Your number is: " + number);
        }


    }
}
