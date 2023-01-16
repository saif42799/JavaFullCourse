package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class roundTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random number between 0 and 100: ");
        int userNun = input.nextInt();
        System.out.println("Your random number is " + userNun);

        Random random = new Random();
        int mynum = random.nextInt(100);
        System.out.println("My random number is: " + mynum);

    }
}
