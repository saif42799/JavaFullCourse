package IfStatements;

import java.util.Random;

public class ifSate {
    public static void main(String[] args) {

        Random random = new Random();

        boolean a = random.nextBoolean();
        boolean b = random.nextBoolean();

        if (a == true && b == true ){
            System.out.println("It's true");
        }
        else if (a == true && b == false){
            System.out.println("True came first");
        }
        else if (a == false && b == true){
            System.out.println("False came first");
        }
        else {
            System.out.println("Its false");
        }

    }
}
