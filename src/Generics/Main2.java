package Generics;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

    MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
    MyGenericClass<Double> myDOuble = new MyGenericClass<>(3.14);
    MyGenericClass<Character> myChar = new MyGenericClass<>('@');
    MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDOuble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}
