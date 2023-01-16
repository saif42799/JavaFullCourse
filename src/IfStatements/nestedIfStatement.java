package IfStatements;

import java.util.Scanner;

public class nestedIfStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 100){
            if (number >= 50){
                System.out.println("You won!!");
            }

        }else if (number <= 200){
            if (number >= 150){
                System.out.println("You lost!!");
            }
        }
        else {
            System.out.println("Better luck next time. :( ");
        }



    }
}
