package ObjectOrientedProgramming;

public class EmployeeDesk {

    //object passing
    // void - non returning
    void desk(Employee employeeObject){
        if (employeeObject.getRank() > 8){
            System.out.println("The employee " + employeeObject.getName() +  " has an office.");
        }
        else {
            System.out.println("This employee " + employeeObject.getName() +  " has a desk.");
        }
    }

}
