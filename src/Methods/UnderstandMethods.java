package Methods;

public class UnderstandMethods {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        //1
        printString1(x,y);

        //2
        printString2(x, y);

        //3
        System.out.println(printString3(x,y));

        //4
        UnderstandMethods u = new UnderstandMethods("bird");
        u.display();

        //5
        print("Hello World");
        print(45);
    }

    // Static vs Non-Static
    //1
    public static void printString1(int content1, int con2){
        int z = content1 + con2;
        System.out.println("Your 1st number: " + z);
    }
    //2
    //when You don't have the access modifier(public) it means you can only use this method in this classes same package
    // when it is static it means it belongs to the class
    //When it doesn't have static it can be applied to an instance(object)
    // When you have a void it means non-returning method
    // When you don't have a void you have to use return
    static void printString2(int x, int y){
        int z = x + y;
        System.out.println("Your 2nd number: " +  z);
    }

    //3
    public static String printString3(int c, int b){
        int z = c + b;
        return "You 3rd number " + z;
    }

    //4
    String name;
    UnderstandMethods(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Hi " + name);
    }

    //5
    //overload method
    //You can have two methods that have the same name as long as they have different number or types of parameters.

    public static void print(String content){
        System.out.println(content);
    }
    public static void print(int content){
        System.out.println(content);
    }





}
