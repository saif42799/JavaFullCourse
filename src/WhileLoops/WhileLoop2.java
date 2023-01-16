package WhileLoops;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x number: ");
        int number = input.nextInt();
        System.out.print("Enter y number: ");
        int number2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter a symbol: ");
        String symbol = input.nextLine();

        boolean valid = false;
        while(!valid){
            for (int i = 1; i <= number2; i++){
                System.out.println();

                for (int j = 1; j <= number; j++) {
                    System.out.print(symbol);
                }
            }
            valid = true;

        }

    }
}
