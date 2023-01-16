package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryStore = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Dounts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryStore.add(bakeryList);
        groceryStore.add(produceList);
        groceryStore.add(drinksList);

        System.out.println(groceryStore.get(0));
        System.out.println(groceryStore.get(1));
        System.out.println(groceryStore.get(2));

        System.out.println(groceryStore.get(0).get(0));

        System.out.println(Arrays.toString(new ArrayList[]{groceryStore}));

        for (int i = 0; i < groceryStore.size(); i++){
            System.out.println(groceryStore.get(i));
        }



    }
}
