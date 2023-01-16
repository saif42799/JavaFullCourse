package WhileLoops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()){
            System.out.print("Enter your name: ");
            name = input.nextLine();

        }
        System.out.println("Hello " + name);

    }
}
