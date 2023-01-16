package StringMethod;

import java.util.Locale;

public class stringMethod {
    public static void main(String[] args) {

        String name = "Bro";
        String name2 = "   Bro ";
        boolean resut = name.equalsIgnoreCase("bro");

        int resuilt2 = name.length();

        char result3 = name.charAt(0);

        int reslut4 = name.indexOf("B");

        boolean result5 = name.isEmpty();

        String result6  = name.toUpperCase();

        String result7  = name.toLowerCase();

        String result8 = name2.trim();

        String result9 = name.replace('o', 'a');

        System.out.println(resut);
        System.out.println(resuilt2);
        System.out.println(result3);
        System.out.println(reslut4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);



    }
}
