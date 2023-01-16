package CopyObjects;

import java.time.Year;

public class Car {

    //attributes
    private String make;
    private String model;
    private int year;

    //constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(Car x){
        this.copy(x);

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


    //coppy method
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getMake());
        this.setYear(x.getYear());

    }


}
