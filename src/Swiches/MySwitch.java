package Swiches;

import java.util.Scanner;

public class MySwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 or 2 for a question: ");
        int choice = input.nextInt();

        if (choice == 1){
        System.out.println("Enter a number between 1 and 15. ");
        System.out.print("Number: ");
        int number = input.nextInt();
            switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("The number you choose is small.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("THe number you choose is medium.");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("The number you choose is big");
                break;
            default:
                System.out.println("Out of bound!");
            }
        }

        else if(choice == 2){
            input.nextLine();
            System.out.println("Enter a food you like. Choices Pizza, Ice Cream, or Subway");
            System.out.println("Food: " );
            String food = input.nextLine();
            switch (food){
                case "Pizza":
                    System.out.println("Lunch Time");
                    break;
                case "Ice Cream":
                    System.out.println("Desert Time");
                    break;
                case "Subway":
                    System.out.println("Dinner Time");
                    break;
                default:
                    System.out.println("Not a choice.");
            }


        }
        else {
            System.out.println("Not valid! ");

        }


    }
}
