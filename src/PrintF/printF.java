package PrintF;

public class printF {
    public static void main(String[] args) {

        System.out.printf("This is a format %d string " + "\n", 123);

        boolean myB0oolen = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b Boolean" + "\n", myB0oolen);
        System.out.println(myB0oolen + " Boolean" + "\n");
        System.out.printf("%c" + "\n", myChar);
        System.out.printf("%s" + "\n", myString);
        System.out.printf("%10s" + "\n", myString);
        System.out.printf("%d" + "\n", myInt);
        System.out.printf("%f" + "\n", myDouble);
        System.out.printf("%.2f" + "\n", myDouble);
        System.out.printf("You have this much money %+20f", myDouble);







    }
}


