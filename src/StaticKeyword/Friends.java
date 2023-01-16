package StaticKeyword;

public class Friends {

    //attribute
    String name;

    //static variable
    static int numberOfFriends;

    //constructor
    Friends(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void dispaly(){
        System.out.println("You have "+ numberOfFriends + " friends");
    }
}
