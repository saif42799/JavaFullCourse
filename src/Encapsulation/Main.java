package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet", "Comaro", 2021 );

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear() + "\n");

        car.setMake("Lexus");
        car.setModel("Toyota");
        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());



    }
}
