package Generics;

public class MyGenericClass <Thing> {

    Thing x;

    public MyGenericClass(Thing x) {
        this.x = x;
    }

    public Thing getValue(){
        return x;
    }


}
