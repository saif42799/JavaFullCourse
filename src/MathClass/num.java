package MathClass;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter a second number: ");
        int secondNum = input.nextInt();

        System.out.println("The max number is: " + Math.max(firstNum, secondNum));
        System.out.println("THe min number is: " + Math.min(firstNum, secondNum));
        System.out.println("The absolute number for num one is " + Math.abs(firstNum) + "\n"+
                "The absolute number for num two is " + Math.abs(secondNum));

    }
}
