package Swiches;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {

        Scanner inpput = new Scanner(System.in);
        System.out.println("What day is it today. Check you spelling ");
        String day = inpput.nextLine();

//        String day = "Monday";

        switch (day){
            case "Sunday":
            case "sunday":
                System.out.println("Great its is Sunday");
                break;
            case "Monday":
                System.out.println("Boo! its is Monday");
                break;
            case "Tuesday":
                System.out.println("Uggghh its is Tuesday");
                break;
            case "Wednseday":
                System.out.println("Eeehhh its a Wednseday");
                break;
            case "Thursday":
                System.out.println("Thursday it feels like a Friday");
                break;
            case "Friday":
                System.out.println("Finally its a Friday");
                break;
            case "Saturday":
                System.out.println("Yessss! its Saturday");
                break;
            default:
                System.out.println("That is not a day");
        }


    }
}
