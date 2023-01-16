package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust pizza", "tomato", "mozzarella", "peperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping + "\n");

        System.out.println("Here are the ingredients of your 2nd pizza: ");
        Pizza pizza1 = new Pizza("thicc crust pizza", "tomato", "mozzarella");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese +  "\n");

        System.out.println("Here are the ingredients of your 3nd pizza: ");
        Pizza pizza2 = new Pizza("thicc crust pizza", "tomato");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce + "\n");

        System.out.println("Here are the ingredients of your 4nd pizza: ");
        Pizza pizza3 = new Pizza("thicc crust pizza");
        System.out.println(pizza3.bread);



    }
}
