package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {


        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar.drive();
        myCar.brake();




    }
}
