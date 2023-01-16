package SuperKeyword;

public class Person {

    //attribute
    String name;
    int age;

    //constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //toString Method
    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}
