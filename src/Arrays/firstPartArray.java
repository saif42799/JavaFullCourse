package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class firstPartArray {
    public static void main(String[] args) {

        //simple array
        String[] cars = {"Tesla", "Supra", "GT"};
        int[] numbers = {122,1231,3421,3452};


        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);


        //Array using for loops
        for (int i = 0; i < cars.length ; i++){
            System.out.print(cars[i] + ", ");

        }
        System.out.println();

        for (int i : numbers ){
            System.out.print(i + " ");

        }







    }
}
