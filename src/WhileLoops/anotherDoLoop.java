package WhileLoops;

import java.util.Scanner;

public class anotherDoLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean valid = false;

        do {
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            System.out.println("You are " + age +" years old");

        }
        while(valid);

        System.out.println("You finish!");




    }
}
