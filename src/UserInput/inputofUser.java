package UserInput;

import java.util.Scanner;

public class inputofUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you");
        int age = input.nextInt();

        System.out.println("You are " + age + " years old");

        input.nextLine();
        System.out.println("Favorite food?");

        String food = input.nextLine();
        System.out.println("Food that you like: " + food);

    }
}