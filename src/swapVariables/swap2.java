package swapVariables;

public class swap2 {
    public static void main(String[] args) {

        String power1 = "flight";
        String power2 = "Strength";
        String power3 = "fast";
        String temp;

        temp = power1;
        power1 = power2;
        power2 = power3;
        power3 = temp;

        System.out.println(power1);
        System.out.println(power2);
        System.out.println(power3);


    }
}
