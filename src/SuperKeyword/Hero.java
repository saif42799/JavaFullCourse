package SuperKeyword;

public class Hero extends Person{

    //attribute
    String power;

    //constructor
    Hero(String name, int age, String power){
        super(name,age);
        this.power = power;
    }

    //toString Method
    public String toString(){
        return super.toString() + this.power;
    }
}
