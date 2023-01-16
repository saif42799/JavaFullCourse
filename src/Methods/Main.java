package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double doubleNumber = input.nextDouble();
        System.out.print("Good now enter a integer: ");
        int intNumber = input.nextInt();
        MehtodToMain trial1 = new MehtodToMain();
        trial1.printDouble(doubleNumber,intNumber);

        //2
        printString("Bob");

        //3
        printString("George");

        //4
        System.out.println("The number you types: " + trial1.theInt(90));


        //5th
        System.out.println(trial1.theInt());

        //6
        System.out.println(mummbo());

    }

    // 2nd mehthod
    // Public - gives access to all
    // static - belongs to the class
    // void - non-returning method
    public static void printString(String reply){
        System.out.println(reply + " - Is what you typed");

    }

    // 6th
    // Public - gives access to all
    // Static - belongs to the class
    // No void so you have to return something
    public static String mummbo(){
        return "Mumbo";
    }


}
