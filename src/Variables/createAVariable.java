package Variables;

public class createAVariable {
    public static void main(String[] args) {

        int x; //declaration
        x = 123; //assignment
        int y = 123; //initialization

        System.out.println("The first number is "  + x);
        System.out.println("The second number " + y);

        long a = 1232131231231241223L;
        System.out.println("long stores large numbers, you have to an L at the end of the number " + a);

        byte b = 100;
        System.out.println("A byte can store a lesser number " + b);

        double c = 2.34;
        System.out.println("Double store big decimals " + c);

        float d = 2.34f;
        System.out.println("Float stores smaller decimals " + d);

        boolean e = false;
        System.out.println("Boolean stores only \"true\" or \"false\"");

        char symbol = '@';
        System.out.println("Char or characters contains symbols " + symbol);

        String name = "saif";
        System.out.println("String stores anything in quotes/ letters " + name);

    }
}
