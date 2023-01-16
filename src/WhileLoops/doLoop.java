package WhileLoops;

import java.util.Scanner;

public class doLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Enter your name: ");
            name = input.nextLine();

        }while (name.isEmpty());

        System.out.println("Hello " + name);

    }
}
