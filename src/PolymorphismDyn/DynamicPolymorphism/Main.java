package PolymorphismDyn.DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Animal animal;

        System.out.println("Enter an animal");
        System.out.print("1 = dog or 2 = cat: ");
        int choice = input.nextInt();


        if (choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }




    }
}
