package UserInput;

import java.util.Scanner;

public class askQuestions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is you name? ");
        String name = input.nextLine();


        System.out.print("How old are you:  ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Do you play any sports? ");
        String sport = input.nextLine();


        System.out.println("Hello " + name+", " + "You are " + age + " years old");

        if (sport.equalsIgnoreCase("no")){
            System.out.println("You do not play any sports ");
        }
        else{
            System.out.println("And you play sports  ");

        }




    }
}
