package ZPracticeWork;

import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in fahrenheit to convert to celsius");
        int far = input.nextInt();
        int celcuis = (far - 32) * 5/9;

        System.out.println("Fahrenheit to Celsius: " + celcuis );

        System.out.println("Enter a number in celsius to convert to fahrenheit");
        int cel = input.nextInt();
        int fahrenheit = ((cel * 9/5 )+ 32);
        System.out.println("Celsisus to Fahrenheit: " + fahrenheit);

    }
}
