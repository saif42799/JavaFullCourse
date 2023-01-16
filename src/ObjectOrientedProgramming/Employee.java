package ObjectOrientedProgramming;

public class Employee {

    //attributes
    //private - is only visible to the class that it is in
    //You should make attributes private if you don’t have a reason to make them public or protected.
    private String name;
    private int rank;


    //constructor
    Employee(String name, int rank){
    // The (this.name) is referring to the Employee object. Basically Employee.name and Employee.rank
        this.name = name;
        this.rank = rank;
    }

    //Getter method = special method that will send the attributes to the class that wants to access it(main).
    //Setter method = allows you to manually change or set an attribute in the main.
    //getters setters

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    //methods
    public void rankPostion(){
        if (rank <= 5){
            System.out.println("Your rank is not great. ");
        }
        else{
            System.out.println("You are doing good! ");
        }
    }

    public String nameChecker(){
        if (name.equals("Jamie")){
            return "Welcome Boss";
        }
        else {
            return "Hello " + name;
        }
    }





    //toString
    public String toString(){
        return "Name: " + name + ", Rank: " + rank;
    }

}
