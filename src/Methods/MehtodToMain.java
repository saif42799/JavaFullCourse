package Methods;

public class MehtodToMain{



    // 1st mehthod
    // Public - gives access to all
    // void - non-returning method
    //requiers an object
    public void printDouble(double doubNumber, int intNumber){
        int z = (int) (doubNumber + intNumber);
        System.out.println(z + " Would be the result");

    }


    // 3rd method
    // void - non-returning method
    // default access modifier so it can be used in the classes that are in the same package
    void printString322(String reply){
        System.out.println(reply + " - Is what you typed");

    }

    //4th
    // public - gives access to all
    // int - specifies only int can be returned

    public int theInt(int number){
        return number;
    }

    //5th

    public int theInt(){
        return theInt(44);
    }










}
