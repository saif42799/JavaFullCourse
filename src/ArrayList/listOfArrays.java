package ArrayList;

import java.util.ArrayList;

public class listOfArrays {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(45);
        numbers.add(542);
        numbers.add(455);

        numbers.set(1, 34);

        ArrayList numbers2 = new ArrayList();
        numbers2.add(33);
        numbers2.add(22);
        numbers2.add(11);



        for (int i : numbers){
            System.out.println(i);
        }
        for (Object i : numbers2){
            System.out.println(i);
        }
    }
}
