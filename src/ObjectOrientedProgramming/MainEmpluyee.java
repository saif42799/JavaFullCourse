package ObjectOrientedProgramming;

import ArrayOfObjects.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainEmpluyee {
    public static void main(String[] args) {
        //Encapsulation - basically using getters and setters and private and public in the builder class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your rank: ");
        int rank = input.nextInt();
        System.out.println();


        EmployeeDesk employeeDesk = new EmployeeDesk();
        Employee employee = new Employee("Bob", 5);
        Employee employee1 = new Employee("Jamie" , 10);
        Employee employee2 = new Employee("Judy",4);
        Employee enteredEmployee = new Employee(name, rank);

        employee2.setName("Felica");
        employee2.setRank(1);


        System.out.println(employee);
        employee.rankPostion();
        System.out.println(employee.nameChecker() + "\n");

        System.out.println(employee1);
        employee1.rankPostion();
        party("Jamie", 10);
        System.out.println(employee1.nameChecker() + "\n");

        System.out.println(employee2);
        employee2.rankPostion();
        System.out.println(employee2.nameChecker() + "\n");

        System.out.println(enteredEmployee);
        enteredEmployee.rankPostion();
        System.out.println(enteredEmployee.nameChecker() + "\n");

        System.out.println("You can also use get from the builder class." + "\n" +
                "Employee's name is: " + employee.getName() + " And rank is: " + employee.getRank() + "\n");

        ArrayList<List> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(Collections.singletonList(employee));
        listOfEmployees.add(Collections.singletonList(employee1));
        listOfEmployees.add(Collections.singletonList(employee2));
        listOfEmployees.add(Collections.singletonList(enteredEmployee));

        input.nextLine();

        System.out.println("Do you want a list of the employees? Y/N");
        String yesOrNo = input.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            for (Object i : listOfEmployees) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Thank you, have a good day!" + "\n");
        }
        System.out.println();

        System.out.println("Would you like to see the employee's location? Y/N");
        String location = input.nextLine();

        if (location.equalsIgnoreCase("y")) {
            //object passing
            employeeDesk.desk(employee);
            employeeDesk.desk(employee1);
            employeeDesk.desk(employee2);
            employeeDesk.desk(enteredEmployee);
        }
        else {
            System.out.println("Thank you, have a good day!");
        }

    }


    public static void party(String name, int rank){
        System.out.println("Hey " + name + " boss throw a party!");
    }
}
