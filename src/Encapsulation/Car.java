package Encapsulation;

public class Car {

    //attributes
    private String make;
    private String model;
    private int year;

    //constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //getters
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }




}
