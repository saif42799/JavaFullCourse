package MathClass;

import java.util.Scanner;

public class findHypotenuse {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner inpurt = new Scanner((System.in));
        System.out.println("Enter side x ");
        x = inpurt.nextDouble();

        System.out.println("Enter side y ");
        y = inpurt.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is: " + z);
        inpurt.close();



    }
}
