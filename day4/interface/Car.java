package day44;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    public int hashCode(){
        return Objects.hash(make, model, price);
    }
    public boolean equals(Object o){
        Car other = (Car)o;
        return this.make.equals(other.make) && this.model.equals(other.model) && this.price == other.price;
    }

}
