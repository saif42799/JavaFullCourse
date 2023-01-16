package ArrayOfObjects;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

//        int[] numbers = new  int[3];
//        char[] characters = new char[4];
//        String[] strings = new String[5];
//

//        Food[] refigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");
        Food food4 = new Food(5);
        Food food5 = new Food('$');


        Food[] refigerator = {food1, food2, food3, food4,food5};

        System.out.println(refigerator[0].name);
        System.out.println(refigerator[1].name);
        System.out.println(refigerator[2].name);
        System.out.println(refigerator[3].number);
        System.out.println(refigerator[4].ch);






    }
}
